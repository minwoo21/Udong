package com.example.udong.service;


import com.example.udong.repository.QnaRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class QnaService{

    @Autowired
    private QnaRepository repository;
    
    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "Qna.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
}