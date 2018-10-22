package com.spring.admin.board.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.admin.board.dao.TemplateDaoAdmin;
import com.spring.admin.board.service.TemplateServiceAdmin;
import com.spring.admin.paging.TemplatePaging;
import com.spring.template.vo.TemplateVo2;

@Service("templateServiceAdmin")
public class TemplateServiceAdminImpl implements TemplateServiceAdmin {
	@Autowired
	private TemplateDaoAdmin templateDaoAdmin;

	@Override
	public List<TemplateVo2> getTemplates(HashMap<String, Object> map) {
		int pagetotalcount = 5;
		int pagecount = 5;

		map.put("pagecount", pagecount);

		List<TemplateVo2> list = templateDaoAdmin.getTemplates(map);

		int nowpage = Integer.parseInt((String) map.get("nowpage"));
		int pagegrpnum = Integer.parseInt((String) map.get("pagegrpnum"));
		int totalcount = Integer.parseInt(String.valueOf(map.get("totalcount")));

		TemplatePaging tp = new TemplatePaging(nowpage, pagecount, totalcount, pagetotalcount, pagegrpnum);
		TemplateVo2 page = tp.getPagingInfo();
		map.put("page", page);

		return list;
	}

	@Override
	public void delTemplate(HashMap<String, Object> map) {
		templateDaoAdmin.delTemplate(map);
	}

	@Override
	public TemplateVo2 getTemplateContent(HashMap<String, Object> map) {
		TemplateVo2 content = templateDaoAdmin.getTemplatesContent(map);
		return content;
	}
}
