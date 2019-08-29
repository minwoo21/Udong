package com.example.udong.service;

<<<<<<< HEAD
=======

import java.util.HashMap;
import java.util.Map;

>>>>>>> origin/v.park
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

<<<<<<< HEAD
    public Object getMember(Object dataMap) {
        String sqlMapid = "Club.user";
        Object resultObject = dao.getObject(sqlMapid, dataMap);

=======
    public Object getlocation(Object dataMap){
        String sqlMapid = "Club.location";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
    public Object getinterest(Object dataMap){
        String sqlMapid = "Club.interest";
        Object resultObject = dao.getList(sqlMapid,dataMap);
>>>>>>> origin/v.park
        return resultObject;
    }
}