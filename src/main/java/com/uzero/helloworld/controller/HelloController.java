package com.uzero.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 千叶零
 * @version 1.0
 * create 2023-04-11  18:45:08
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        System.out.println("Hello, World~");
        return "OK";
    }
}
