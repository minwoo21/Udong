package com.example.udong.service;

import com.example.udong.repository.ClubRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClubService {

    @Autowired
    private ClubRepository repository;

    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap) {
        String sqlMapid = "Club.user";
        Object resultObject = dao.getObject(sqlMapid, dataMap);

        return resultObject;
    }
}