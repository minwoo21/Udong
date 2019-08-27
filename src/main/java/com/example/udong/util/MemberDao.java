package com.example.udong.util;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    @Autowired
    private SqlSessionTemplate sqlSession;
    public Object getMap(String sqlMapId, Object dataMap){
        Object result = sqlSession.selectOne(sqlMapId,dataMap);
        return result;
    }
}