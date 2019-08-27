package com.example.udong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = { "/home" })
    public void home_action() {
    }
    @RequestMapping(value = { "/support/{action}" })
    public String support_action( @PathVariable String action ) {
        String viewName = "/support/";
        if("faq".equals(action)){
            viewName += action;

        }
        return viewName;
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