package com.spring.admin.user.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.admin.user.dao.UserDaoAdmin;
import com.spring.user.vo.UserVO2;

@Repository("adminDao")
public class UserDaoAdminImpl implements UserDaoAdmin {
	@Autowired
	private SqlSession session;

	@Override
	public List<UserVO2> getUserAll(HashMap<String, Object> map) {
		session.selectList("Admin.getUserAll", map);
		List<UserVO2> list = (List<UserVO2>) map.get("result");

		return list;
	}

	@Override
	public UserVO2 getUserInfo(String nickname) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("nick_name", nickname);
		session.selectList("Admin.getUser", map);
		UserVO2 vo = ((List<UserVO2>) map.get("result")).get(0);

		return vo;
	}

	@Override
	public void kickMember(HashMap<String, Object> map) {
		map.put("nick_name", map.get("nickname"));
		session.delete("Admin.delUser", map);
	}
}
