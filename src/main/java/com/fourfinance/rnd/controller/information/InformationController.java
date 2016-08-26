package com.fourfinance.rnd.controller.information;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String hello() {
        return "Second View";
    }

}