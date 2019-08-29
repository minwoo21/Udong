package com.example.udong.service;


import java.util.HashMap;
import java.util.Map;

import com.example.udong.repository.ClubRepository;
import com.example.udong.util.ClubDao;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClubService{

    @Autowired
    private ClubRepository repository;
    
    @Autowired
    private ClubDao dao;

    public Object getMember(Object dataMap){
        String sqlMapid = "Club.user";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
    public Object setMember(Object dataMap){
        String sqlMapid = "Club.location";
        Object resultObject = dao.saveObject(sqlMapid,dataMap);
        return resultObject;
    }
	public Object saveObject(Map<String, Object> paramMap) {
		return null;
    }
    public Object getList(Object dataMap) {
		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", repository.findAll());

		return resultObject;
	}
}