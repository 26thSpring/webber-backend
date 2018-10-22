package com.spring.admin.board.dao;

import java.util.HashMap;
import java.util.List;

import com.spring.board.vo.BoardVo2;

public interface BoardDAOAdmin {

	public List<BoardVo2> getListAll(HashMap<String, Object> map);

	public List<BoardVo2> getNotice(HashMap<String, Object> map);

	public void noticeWrite(HashMap<String, Object> map);

	public BoardVo2 getNoticeView(HashMap<String, Object> map);

	public void updateNotice(HashMap<String, Object> map);

	public void deleteNotice(HashMap<String, Object> map);

	public BoardVo2 getBoardView(HashMap<String, Object> map);

	public void deleteBoard(HashMap<String, Object> map);

}
