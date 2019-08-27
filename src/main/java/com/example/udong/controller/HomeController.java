package com.example.udong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = { "/home" })
    public void home_action() {
    }
    @RequestMapping(value = { "/support/faq" })
    public void faq_action() {
    }
    @RequestMapping(value = "/community/{action}")
    public String action02( @PathVariable String action) {
        String viewName = "/community/";
        if("post".equals(action)){
            viewName += action;

        }
        return viewName;
    }
}