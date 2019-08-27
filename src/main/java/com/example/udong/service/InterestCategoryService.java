package com.example.udong.service;

import com.example.udong.repository.InterestCategoryRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class InterestCategoryService{

    @Autowired
    private InterestCategoryRepository repository;
    
    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "InterstCategory.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
}