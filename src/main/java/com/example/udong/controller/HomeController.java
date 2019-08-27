package com.example.udong.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.udong.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private MemberService service;

    @RequestMapping(value = {"/home"})
    public ModelAndView home_action(@RequestParam Map<String, Object> param, ModelAndView modelAndView) {
        String viewName ="/home";
        Object resultMap = new Object();
        Map<String, Object> flagMap = new HashMap<String, Object>();
        if(param.size()!=0)
            resultMap = service.getMember(param);

        if(resultMap.equals(null)){
            flagMap.put("flag", false);
        }
        else{
            flagMap.put("flag", true);
            modelAndView.addObject("resultMap", resultMap);
        }
        modelAndView.setViewName(viewName);
        modelAndView.addObject("flag",flagMap);
        return modelAndView;
    }

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