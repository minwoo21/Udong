package com.example.udong.service;

import com.example.udong.repository.MemberRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MemberService{

    @Autowired
    private MemberRepository repository;
    
    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "Member.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
}