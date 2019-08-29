package com.example.udong.util;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RankingDao {
<<<<<<< HEAD

=======
    
>>>>>>> v.park
    @Autowired
    private SqlSessionTemplate sqlSession;

    public Object getList(String sqlMapId, Object dataMap) {
<<<<<<< HEAD
        Object resultObject = sqlSession.selectList(sqlMapId, dataMap);
        return resultObject;
    }

=======
		Object resultObject = sqlSession.selectList(sqlMapId, dataMap);

		return resultObject;
    }

    public Object getObject(String sqlMapId, Object dataMap) {
		Object resultObject = sqlSession.selectOne(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object saveObject(String sqlMapId, Object dataMap) {
		Integer resultObject = sqlSession.insert(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object updateObject(String sqlMapId, Object dataMap) {
		Integer resultObject = sqlSession.update(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object deleteObject(String sqlMapId, Object dataMap) {
		
		Integer resultObject = sqlSession.delete(sqlMapId,dataMap);
		return resultObject;
	}
>>>>>>> v.park
}