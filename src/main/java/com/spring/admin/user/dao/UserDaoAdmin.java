package com.spring.admin.user.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.user.vo.UserVO2;

public interface UserDaoAdmin {

	public List<UserVO2> getUserAll(HashMap<String, Object> map);

	public UserVO2 getUserInfo(String nickname);

	public void kickMember(HashMap<String, Object> map);

}
