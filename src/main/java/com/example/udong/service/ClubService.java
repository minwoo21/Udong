package com.example.udong.service;


import java.util.HashMap;
import java.util.Map;

import com.example.udong.repository.ClubRepository;
import com.example.udong.util.ClubDao;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClubService {

    @Autowired
    private ClubRepository repository;

    @Autowired
    private ClubDao dao;

    public Object getlocation(Object dataMap){
        String sqlMapid = "Club.location";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
    public Object getinterest(Object dataMap){
        String sqlMapid = "Club.interest";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
}