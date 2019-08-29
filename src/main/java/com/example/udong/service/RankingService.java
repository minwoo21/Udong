package com.example.udong.service;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.udong.util.RankingDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingService {

    @Autowired
    private RankingDao dao;

    public Object get(Object dataMap) {
        String sqlMapid = "ranking.fetch";
        Object resultObject = dao.getList(sqlMapid, dataMap);

        // Append Rank num
        ArrayList<HashMap<String, Object>> resultObject02 = new ArrayList<HashMap<String, Object>>();

        int recordsnum = ((ArrayList<HashMap<String, Object>>) resultObject).size();

        if (recordsnum > 10) {
            for (int i = 0; i < 10; i++) {
                resultObject02.add((HashMap<String, Object>) ((Map) ((ArrayList<Object>) resultObject).get(i)));
                resultObject02.get(i).put("RANK", i + 1);
            }
        } else {
            for (int i = 0; i < recordsnum; i++) {
                // ((Map) ((ArrayList<Object>) resultObject).get(i)).put("RANK", i + 1);
                resultObject02.add((HashMap<String, Object>) ((Map) ((ArrayList<Object>) resultObject).get(i)));
                resultObject02.get(i).put("RANK", i + 1);
            }
        }
        return resultObject02;
    }

	public Object getlocation(Map<String, Object> paramMap) {
		return null;
	}

	public Object getinterest(Map<String, Object> paramMap) {
		return null;
	}
=======

import java.util.HashMap;
import java.util.Map;

import com.example.udong.repository.ClubRepository;
import com.example.udong.util.ClubDao;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RankingService{

    @Autowired
    private ClubRepository repository;
    
    @Autowired
    private ClubDao dao;

    public Object getlocation(Object dataMap){
        String sqlMapid = "Club.location";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }

    public Object getlocation_search(Object dataMap){
        String sqlMapid = "Club.location_search";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
    
    public Object getinterest(Object dataMap){
        String sqlMapid = "Club.interest";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }

    public Object getinterest_search(Object dataMap){
        String sqlMapid = "Club.interest_search";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
>>>>>>> v.park
}