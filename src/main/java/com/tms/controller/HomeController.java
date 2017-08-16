package com.tms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller

@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "/home", method = GET)
    public String Home() {
        return "home";
    }
}
