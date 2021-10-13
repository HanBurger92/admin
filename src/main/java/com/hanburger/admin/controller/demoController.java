package com.hanburger.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo<br>
 * <br>
 *
 * @author baoh
 * @date 2021/10/13 13:56
 */
@RestController
@RequestMapping("/demo")
public class demoController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello World";
    }
}
