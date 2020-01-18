package com.pppgod.toy.controller;

import com.pppgod.toy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String index(){
        System.out.println(testService.test());
        return "index";
    }
}
