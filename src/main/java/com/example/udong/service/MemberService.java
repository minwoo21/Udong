package com.example.udong.service;

import java.util.HashMap;

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
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    } 
    public Object setMember(Object dataMap){
        String sqlMapid = "Member.signup";
        Object resultObject = dao.saveObject(sqlMapid,dataMap);
        return resultObject;
    }

    public Object getList(Object dataMap) {
		String sqlMapId = "Member.list";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", repository.findAll());

		return resultObject;
	}
}