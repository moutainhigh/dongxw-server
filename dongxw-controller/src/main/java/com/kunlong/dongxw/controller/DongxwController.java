package com.kunlong.dongxw.controller;


import app.support.query.PageResult;
import com.kunlong.platform.utils.JsonResult;
import com.kunlong.dongxw.dongxw.domain.Customer;
import com.kunlong.dongxw.dongxw.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cust类
 * Package:
 * Author: cch/leijiming
 * Date: Created in 2018/8/23 16:50
 */
@RestController
@RequestMapping("/dongxw/customer")
public final class DongxwController     {
    @Autowired
    CustomerService customerService;



    @RequestMapping("/findById/{id}")
    public JsonResult<Customer> findById(@PathVariable("id") Integer id,HttpServletResponse response) throws IOException {
//        response.addHeader("Access-Control-Allow-Origin", "*");
//        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        return   JsonResult.success(customerService.findById(id))    ;
    }

    @RequestMapping("/query")
    public PageResult<Customer> query(@RequestBody PageResult<Customer> pageResult) throws IOException {
        //PageResult<Customer> pageResult = new PageResult<Customer>();
//        Customer.QueryParam qp = BeanMapper.getInstance().map(pageResult, Customer.QueryParam.class);
//
//
//        pageResult.setTotal(customerService.countByQueryParam(qp));
//        pageResult.setData(customerService.findByQueryParam(qp));
        return pageResult;
    }


}

