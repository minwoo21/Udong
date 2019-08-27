package com.example.udong.service;

import com.example.udong.util.MemberBean;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MemberService{
    @Autowired
    private MemberDao dao;
    public Object getMember(Object dataMap){
        String sqlMapid = "Member.user";
        Object resultObject = dao.getMap(sqlMapid,dataMap);
        return resultObject;
    }
}