package com.liu.demo.controller;


import com.liu.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String findAllCustomer(Map<String,Object> model){
        model.put("pos",customerService.findAllCustomer());
        return "customerIndex";
    }
}
