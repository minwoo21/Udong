package com.example.udong.service;

import com.example.udong.repository.AreaRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AreaService{

    @Autowired
    private AreaRepository repository;
    
    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "Area.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
}