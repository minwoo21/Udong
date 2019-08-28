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

import antlr.collections.List;

@Controller
public class HomeController {

    @Autowired
    private MemberService service;

    // Receive Parameters from Html Using @RequestParam Map with @PathVariable
    @RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> flagMap = new HashMap<String, Object>();

        String viewName = action;

        if (paramMap.get("flag") == null)
            flagMap.put("flag", false);
        else {
            flagMap.put("flag", paramMap.get("flag"));
        }
        // divided depending on action value
        if ("login".equals(action)) {

        } else if ("signup".equals(action)) {

        } else if ("home".equals(action)) {
            if (!paramMap.keySet().contains("submit")) {// home으로 가려할 때
                viewName = "/home";
            } 
            
            else {
                if (paramMap.get("submit").equals("로그인")) {  //로그인 창에서 버튼을 눌렀을때
                    resultMap = (Map) service.getMember(paramMap);
                    if (resultMap.size() != 0) {
                        flagMap.put("flag", true);
                        modelAndView.addObject("resultMap", resultMap);
                    } else {
                        flagMap.put("flag", false);
                        viewName = "/login";
                    }
                }
                else if(paramMap.get("submit").equals("로그아웃")){
                    viewName = "/home";
                    flagMap.put("flag", false);
                }
            }
        }
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.addObject("flag", flagMap);
        return modelAndView;
    }
}