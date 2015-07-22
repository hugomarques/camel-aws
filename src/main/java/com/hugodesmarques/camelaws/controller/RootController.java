package com.hugodesmarques.camelaws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hugomarques on 21/7/15.
 */
@Controller
public class RootController {

    @ResponseBody
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }

}
