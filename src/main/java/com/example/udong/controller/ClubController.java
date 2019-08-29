package com.example.udong.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.udong.service.RankingService;

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
    private RankingService service;

    // Receive Parameters from Html Using @RequestParam Map with @PathVariable
    @RequestMapping(value = "/club/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {

        Object resultMap = new HashMap<String, Object>();
        Map<String, Object> flagMap = new HashMap<String, Object>();

        if (paramMap.get("flag") == null)
            flagMap.put("flag", false);
        else {
            flagMap.put("flag", paramMap.get("flag"));
        }
        // divided depending on action value
        if ("location".equals(action)) {
            // location logic
        } else if ("interest".equals(action)) {
            // interest up logic
        } else if ("ranking".equals(action)) {
            // ranking logic
            resultMap = service.get(paramMap);
        } else if ("introduce".equals(action)) {

        } else if ("clubBoard".equals(action)) {
        }

        String viewName = "/club/" + action;

        modelandView.setViewName(viewName);

        modelandView.addObject("paramMap", paramMap);
        modelandView.addObject("resultMap", resultMap);
        modelandView.addObject("flag", flagMap);
        return modelandView;
    }
}