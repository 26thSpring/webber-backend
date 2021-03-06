package com.spring.reply.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.reply.dao.ReplyDao;
import com.spring.reply.vo.ReplyVo;
import com.spring.token.service.TokenService;

@Repository("replyService")
public class ReplyServiceImpl implements com.spring.reply.service.ReplyService {
	@Autowired
	private ReplyDao replyDao;
	
	@Autowired
	private TokenService tokenService;
	@Override
	public List<ReplyVo> getReplyList(HashMap<String, Object> map) {
		List<ReplyVo> replyList=replyDao.getReplyList(map);
		return replyList;
	}
	@Override
	public ReplyVo getReplyVo(HashMap<String, Object> map) {
		List<ReplyVo> replyList=replyDao.getReplyVoList(map);
		if(replyList.size()==0) {
			return null;
		}
		return replyList.get(0);
	}
	@Override
	public void insertReply(HashMap<String, Object> map) {
		//String token="eyJ0eXAiOiJKV1QiLCJyZWdEYXRlIjoxNTM5OTI3NzMwNTAzLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1NDA1MzI1MzAsIndlYmJlclVzZXIiOnsiZW1haWwiOm51bGwsIm5pY2tuYW1lIjoi7L2U65Sp7ZWY64qU7IKs7J6QIiwidGh1bWJuYWlsIjoiaHR0cDovL2ltZy5hbGljZG4uY29tL2ltZ2V4dHJhL2kzLzQwMzk5ODMxNC9UQjI1SlZ3ak9BS0wxSmpTWkZvWFhhZ0NGWGFfISE0MDM5OTgzMTQuanBnIiwiaW50cm8iOm51bGwsImF1dGgiOjAsImFjY2Vzc1Rva2VuIjpudWxsLCJzb2NpYWxUeXBlIjpudWxsfX0.Tf50w2ejJHsVPpPrtxSpLrsepiuniFd_De8QEUT4AJ8";
		String token=(String) map.get("access_token");
		
		if(tokenService.isUsable(token)) {
			
			Map<String,Object> userInfo=tokenService.get(token);
			String nickname=(String) userInfo.get("nickname");
			map.put("nickname",nickname);
			System.out.println("fdfasdf"+map);
			replyDao.insertReply(map);
			
			
		}else {
			map.put("err_code", "-47474447");
			return ;
		}
		
	}
	@Override
	public void updateReply(HashMap<String, Object> map) {
		String token=(String) map.get("access_token");
		
		if(tokenService.isUsable(token)) {
			
			Map<String,Object> userInfo=tokenService.get(token);
			String nickname=(String) userInfo.get("nickname");
			map.put("nickname",nickname);
			replyDao.updateReply(map);			
			
		}else {
			map.put("err_code", "-47474447");
			return ;
		}
		
	}
	@Override
	public void deleteReply(HashMap<String, Object> map) {
		String token=(String) map.get("access_token");
		
		if(tokenService.isUsable(token)) {
			
			Map<String,Object> userInfo=tokenService.get(token);
			String nickname=(String) userInfo.get("nickname");
			map.put("nickname",nickname);
			replyDao.deleteReply(map);
			
			
		}else {
			map.put("err_code", "-47474447");
			return ;
		}
	}

}
