package com.example.udong.service;


import com.example.udong.repository.FaqRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FaqService{

    @Autowired
    private FaqRepository repository;
    
    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "Faq.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
}