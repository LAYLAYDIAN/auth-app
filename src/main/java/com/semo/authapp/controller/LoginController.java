package com.semo.authapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 登录
 * @Author: Liu Guo Dian
 * @Date: 2020/9/30 10:31
 * @Version: 1.0
 */
@RestController
public class LoginController {
    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("api/hello")
    public String apiHello() {
        return "Hello World";
    }
}
