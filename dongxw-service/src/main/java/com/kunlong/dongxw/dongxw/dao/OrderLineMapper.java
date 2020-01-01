package com.kunlong.dongxw.dongxw.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.hbatis.orm.mapper.HbatisMapper;
import com.kunlong.dongxw.dongxw.domain.OrderLine;
/**
 * OrderLineMapper
 * @author generator
 * @date 2020年01月01日
 */
public interface OrderLineMapper extends HbatisMapper<OrderLine, Integer> {
	
	
	//-- 按实体参数查询[START] 
	List<OrderLine> findByQueryParam(@Param("queryParam")OrderLine.QueryParam queryParam);
	
	long countByQueryParam(@Param("queryParam")OrderLine.QueryParam queryParam);
	//-- 按实体参数查询[END] 
	
	//-- 自定义业务方法，请写在下方 -->
}