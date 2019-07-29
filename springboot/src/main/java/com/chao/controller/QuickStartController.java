package com.chao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {
    @RequestMapping("/quick1")
    @ResponseBody
    public String quick(){
        System.out.println("访问成功了");
        return "springboot 访问成功了";
    }

}
