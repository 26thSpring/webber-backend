package com.spring.admin.user.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.admin.paging.UserPaging;
import com.spring.admin.user.dao.UserDaoAdmin;
import com.spring.admin.user.service.UserServiceAdmin;
import com.spring.user.vo.UserVO2;

@Service("userService2")
public class UserServiceAdminImpl implements UserServiceAdmin {
	@Autowired
	private UserDaoAdmin adminDao;

	@Override
	public List<UserVO2> getUserAll(HashMap<String, Object> map) {
		/* 페이징 처리를 위한 내용 추가 */
		int pagetotalcount = 10; // 화면에 보여줄 페이지 번호의 갯수 paging.jspf 의 for 문에 사용
		int pagecount = 10; // 한페이지에 보여줄 게시물 라인(줄)수

		map.put("pagecount", pagecount); // db 에 전달하려고 보관

		// 실제 db 조회 menu_id, nowpage, pagecount
		List<UserVO2> list = adminDao.getUserAll(map);

		/* 페이징을 위한 정보 처리 */
		int nowpage = Integer.parseInt((String) map.get("nowpage"));
		int pagegrpnum = Integer.parseInt((String) map.get("pagegrpnum"));
		int totalcount = Integer.parseInt(String.valueOf(map.get("totalcount")));

		UserPaging up = new UserPaging(nowpage, pagecount, totalcount, pagetotalcount, pagegrpnum);
		UserVO2 page = up.getPagingInfo();
		map.put("page", page);

		return list;
	}

	@Override
	public UserVO2 getUserInfo(String nickname) {
		UserVO2 vo = adminDao.getUserInfo(nickname);
		return vo;
	}

	@Override
	public void kickMember(HashMap<String, Object> map) {
		adminDao.kickMember(map);
	}

}
