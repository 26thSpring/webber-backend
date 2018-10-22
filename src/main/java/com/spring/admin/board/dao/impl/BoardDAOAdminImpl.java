package com.spring.admin.board.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.admin.board.dao.BoardDAOAdmin;
import com.spring.board.vo.BoardVo2;

@Repository("boardDaoAdmin")
public class BoardDAOAdminImpl implements BoardDAOAdmin {
	@Autowired
	private SqlSession session;

	@Override
	public List<BoardVo2> getListAll(HashMap<String, Object> map) {
		session.selectList("Admin.BoardList", map);
		List<BoardVo2> list = (List<BoardVo2>) map.get("result");

		return list;
	}

	@Override
	public List<BoardVo2> getNotice(HashMap<String, Object> map) {
		session.selectList("Admin.notice", map);
		List<BoardVo2> list = (List<BoardVo2>) map.get("result");

		return list;
	}

	@Override
	public void noticeWrite(HashMap<String, Object> map) {
		session.insert("Admin.noticeWrite", map);
	}

	@Override
	public BoardVo2 getNoticeView(HashMap<String, Object> map) {
		session.selectList("Admin.noticeView", map);
		map.put("board_id", map.get("board_id"));
		
		BoardVo2 vo = ((List<BoardVo2>) map.get("result")).get(0);
		return vo;
	}

	@Override
	public void updateNotice(HashMap<String, Object> map) {
		session.update("Admin.noticeUpdate", map);
	}

	@Override
	public void deleteNotice(HashMap<String, Object> map) {
		session.delete("Admin.noticeDelete", map);
	}

	@Override
	public BoardVo2 getBoardView(HashMap<String, Object> map) {
		session.selectList("Admin.boardView", map);
		map.put("board_id", map.get("board_id"));
		
		BoardVo2 vo = ((List<BoardVo2>) map.get("result")).get(0);
		return vo;
	}

	@Override
	public void deleteBoard(HashMap<String, Object> map) {
		session.delete("Admin.BoardDelete", map);
	}

}
