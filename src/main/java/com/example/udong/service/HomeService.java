package com.example.udong.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.udong.repository.ClubRepository;
import com.example.udong.util.RankingDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private RankingDao dao;

    @Autowired
    private ClubRepository club_repository;

    public Object get(Object dataMap) {
        String sqlMapid = "ranking.fetch";
        Object resultObject = dao.getList(sqlMapid, dataMap);

        return resultObject;
    }
    public Object get_pickList(Object dataMap) {
		String sqlMapId = "home.editor_pick";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", club_repository.findAll());

		return resultObject;
    }
}