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

    public Object getPost(Object dataMap){
        String sqlMapid = "Board.post";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
    public Object getPostOne(Object dataMap){
        String sqlMapid = "Board.postOne";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
    public Object getSearchPost(Object dataMap){
        String sqlMapid="Board.searchPost";
        Object resultObject = dao.getList(sqlMapid,dataMap);
        return resultObject;
    }
    public void deletePost(Object dataMap){
        String sqlMapid="Board.deletePost";
        dao.deleteObject(sqlMapid,dataMap);
    }
    public Object isRecommend(Object dataMap){
        String sqlMapid="Recommend.isRecommend";
        Object resultObject = dao.getObject(sqlMapid,dataMap);
        return resultObject;
    }
    public void addRecommend(Object dataMap){
        String sqlMapid="Recommend.addRecommend";
        dao.updateObject(sqlMapid,dataMap);
    }
    public void subRecommend(Object dataMap){
        String sqlMapid="Recommend.subRecommend";
        dao.updateObject(sqlMapid,dataMap);
    }
}