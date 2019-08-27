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
public class CommunityController {

    // Receive Parameters from Html Using @RequestParam Map with @PathVariable
    @RequestMapping(value = "/community/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {

        Object resultMap = new HashMap<String, Object>();

        // divided depending on action value
        if ("free".equals(action)) {
            // free logic
        } else if ("qna".equals(action)) {
            // qna logic
        } else if ("post".equals(action)) {
            // post logic
        }

        String viewName = "/community/" + action;

        modelandView.setViewName(viewName);

        modelandView.addObject("paramMap", paramMap);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }
}