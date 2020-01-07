package com.yzit.project.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: yangjingqi
 * Date: 2019/12/31
 * Time: 16:21
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "测试";
    }

}
