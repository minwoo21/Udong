package com.example.udong.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    // Receive Parameters from Html Using @RequestParam Map with @PathVariable
    @RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {

        Object resultMap = new HashMap<String, Object>();

        // divided depending on action value
        if ("login".equals(action)) {
            // login logic
        } else if ("signup".equals(action)) {
            // sign up logic
        } else if ("logout".equals(action)) {
            // logout logic
        }

        String viewName = action;

        modelandView.setViewName(viewName);

        modelandView.addObject("paramMap", paramMap);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
}