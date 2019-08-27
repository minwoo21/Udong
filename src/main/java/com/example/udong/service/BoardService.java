package com.example.udong.service;

import com.example.udong.repository.BoardRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BoardService{

    @Autowired
    private BoardRepository repository;
    
    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "Board.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
}