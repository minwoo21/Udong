package com.example.udong.service;

import java.util.HashMap;
import java.util.Map;

import com.example.udong.repository.RecommendRepository;
import com.example.udong.util.MemberDao;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RecommendService {

  @Autowired
  private RecommendRepository repository;

  @Autowired
  private MemberDao dao;

  public Object isRecommend(Object dataMap) {
    String sqlMapid = "Recommend.isRecommend";
    Object resultObject = dao.getList(sqlMapid, dataMap);
    return resultObject;
  }
  public void subRecommend(Object dataMap){
    String sqlMapid = "Recommend.subRecommend";
    dao.updateObject(sqlMapid, dataMap);
  }
  public void addRecommend(Object dataMap){
    String sqlMapid = "Recommend.insertRecommend";
    dao.updateObject(sqlMapid, dataMap);
  }

}