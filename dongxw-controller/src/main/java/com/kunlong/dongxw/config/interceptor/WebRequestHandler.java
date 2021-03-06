package com.kunlong.dongxw.config.interceptor;


import app.support.context.DefaultRequestContextFactory;
import app.support.context.RequestContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kunlong.dongxw.consts.ApiConstants;
import com.kunlong.dongxw.context.DongxwContext;
import com.kunlong.platform.consts.RequestContextConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class WebRequestHandler implements HandlerInterceptor {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse response, Object arg2, Exception arg3) throws Exception {
		DefaultRequestContextFactory.getInstance().delete();
		
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse rsp, Object arg2, ModelAndView arg3) throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse rsp, Object arg2) throws Exception {
		logger.info("接收请求[path:"+req.getRequestURI()+"]");
		String token = req.getHeader(ApiConstants.AUTH_TOKEN_KEY_WEB);
		if(StringUtils.isEmpty(token)) {
			Object reqToken = req.getParameter(ApiConstants.AUTH_TOKEN_KEY_WEB.toLowerCase());
			token = (reqToken==null?null:reqToken.toString());
		}
		
		if(StringUtils.isEmpty(token) ) {
			writeError(401,"authorization_none","无认证标识",rsp);
			return false;
		}
		//SessionHolder session = SessionHolder.getInstance(token);
		Boolean exists = DongxwContext.getAppCtxt().getBean(DongxwContext.class).authApiService.checkExists(token);
		if (!exists) {
			writeError(401, "authorization_fail", "TOKEN不存在或已失效", rsp);
			return false;
		}
		RequestContext ctx = DefaultRequestContextFactory.getInstance().getRequestContext();
		
		if (ctx == null) {
			ctx = DefaultRequestContextFactory.getInstance().create();
		}
		
		ctx.setAttribute(RequestContextConst.KEY_SESSIONKEY, token);
		return true;
	}
	
	private void writeError(int httpStatus,String code,String msg,HttpServletResponse rsp) throws  IOException {
		logger.error("证证失败[httpStatus:{},code:{},msg:{}]",new Object[] {httpStatus,code,msg});
		rsp.setStatus(httpStatus);
		rsp.setCharacterEncoding("UTF-8");
		rsp.setHeader("content-type", "application/json;charset=utf-8");
		Map<String,String> root = new HashMap<String,String>();
		root.put("code", code);
		root.put("msg", msg);
		ObjectMapper objMapper = new ObjectMapper();
		
		rsp.getWriter().print(objMapper.writeValueAsString(root));
	}

}
