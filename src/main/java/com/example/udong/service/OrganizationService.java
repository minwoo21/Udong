package com.example.udong.service;

import java.util.HashMap;
import java.util.Map;

import com.example.udong.repository.OrganizationRepository;
import com.example.udong.repository.ShareDao;
import com.example.udong.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository repository;

	@Autowired
	private ShareDao dao;

	@Autowired
	private CommonUtil commonUtil;

	public Object getList(Object dataMap) {
		String sqlMapId = "organization.list";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", repository.findAll());

		return resultObject;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "organization.read";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String uniqueSequence = (String) dataMap.get("ORGANIZATION_SEQ");

		if ("".equals(uniqueSequence)) {
			uniqueSequence = commonUtil.getUniqueSequence();
		}
		dataMap.put("ORGANIZATION_SEQ", uniqueSequence);

		String sqlMapId = "organization.insert";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;
	}

	public Object updateObject(Map<String, Object> dataMap) {
		String sqlMapId = "organization.update";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "organization.delete";

		Integer resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		Object resultObject = this.getList(dataMap);

		return resultObject;
	}
}
