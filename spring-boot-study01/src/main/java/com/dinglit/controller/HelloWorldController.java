package com.dinglit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/7.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/getHello")
    public String getHello() {
        return "Hello World!";
    }
}