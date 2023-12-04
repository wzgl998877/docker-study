package com.zt.study.docker.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengtao on 2023/12/2
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @RequestMapping("/workflow")
    public String workflow() {
        return "hello workflow!！";
    }
}
