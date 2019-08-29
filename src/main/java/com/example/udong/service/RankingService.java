package com.example.udong.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

import com.example.udong.repository.RankingDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingService {

    @Autowired
    private RankingDao dao;

    public Object get(Object dataMap) {
        String sqlMapid = "ranking.fetch";
        Object resultObject = dao.getList(sqlMapid, dataMap);

        int recordsnum = ((ArrayList<HashMap<String, Object>>) resultObject).size();

        for (int i = 0; i < recordsnum; i++) {
            ((Map) ((ArrayList<Object>) resultObject).get(i)).put("RANK", i + 1);
        }

        return resultObject;
    }
}