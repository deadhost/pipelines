package com.fourfinance.rnd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Version 1.0";
    }

}
