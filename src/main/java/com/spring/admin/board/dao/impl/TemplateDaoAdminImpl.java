package com.spring.admin.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.admin.board.dao.TemplateDaoAdmin;
import com.spring.template.vo.TemplateVo2;

@Repository("templateDaoAdmin")
public class TemplateDaoAdminImpl implements TemplateDaoAdmin {
	@Autowired
	private SqlSession session;

	@Override
	public List<TemplateVo2> getTemplates(HashMap<String, Object> map) {
		session.selectList("Admin.templateAll", map);
		List<TemplateVo2> list = (List<TemplateVo2>) map.get("result");

		return list;
	}

	@Override
	public void delTemplate(HashMap<String, Object> map) {
		session.delete("Admin.templateDelete", map);
	}

	@Override
	public TemplateVo2 getTemplatesContent(HashMap<String, Object> map) {
		session.selectList("Admin.templateView", map);
		TemplateVo2 content = ((List<TemplateVo2>) map.get("result")).get(0);

		return content;
	}
}
