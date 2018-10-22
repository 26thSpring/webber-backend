package com.spring.admin.board.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.template.vo.TemplateVo2;

public interface TemplateDaoAdmin {

	public List<TemplateVo2> getTemplates(HashMap<String, Object> map);

	public void delTemplate(HashMap<String, Object> map);

	public TemplateVo2 getTemplatesContent(HashMap<String, Object> map);

}
