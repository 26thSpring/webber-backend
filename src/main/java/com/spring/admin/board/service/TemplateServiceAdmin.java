package com.spring.admin.board.service;

import java.util.HashMap;
import java.util.List;

import com.spring.template.vo.TemplateVo2;

public interface TemplateServiceAdmin {

	public List<TemplateVo2> getTemplates(HashMap<String, Object> map);

	public void delTemplate(HashMap<String, Object> map);

	public TemplateVo2 getTemplateContent(HashMap<String, Object> map);
	
}
