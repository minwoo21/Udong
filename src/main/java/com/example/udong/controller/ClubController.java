package com.example.udong.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.udong.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClubController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/club/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {

        Object resultMap = new HashMap<String, Object>();

        if ("interest".equals(action)) {
            resultMap = service.getObject(paramMap);
        } else if ("location".equals(action)) {
            resultMap = service.getObject(paramMap);
        } else if ("ranking".equals(action)) {
            resultMap = service.getObject(paramMap);
        }

        String viewName = "/club/" + action;

        modelandView.setViewName(viewName);

        modelandView.addObject("paramMap", paramMap);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;

    }

}