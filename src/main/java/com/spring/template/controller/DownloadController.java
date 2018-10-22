package com.spring.template.controller;

import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.activation.CommandMap;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.template.service.TemplateService;
import com.spring.template.vo.TemplateVo;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class DownloadController {
	@Autowired
	private TemplateService templateService;
	@RequestMapping(value="/api/template/file/{template_id}")
	public void downloadFileHTML( HttpServletResponse response
			,@PathVariable("template_id") String template_id) throws Exception{
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("board_id", template_id);
		TemplateVo tvo=templateService.getTemplateVo(map);
		String fileName=tvo.getFile_name();
		
	   
	    String originalFileName = tvo.getFile_path_html();
	    
	     
	    byte fileByte[] = FileUtils.readFileToByteArray(new File(originalFileName));
	     
	    response.setContentType("application/octet-stream");
	    response.setContentLength(fileByte.length);
	    response.setHeader("Content-Disposition", "attachment; fileName=\"" + URLEncoder.encode(fileName,"UTF-8")+"\";");
	    response.setHeader("Content-Transfer-Encoding", "binary");
	    response.getOutputStream().write(fileByte);
	     
	    response.getOutputStream().flush();
	    response.getOutputStream().close();
	    
	   
	 
	 
	}



}
