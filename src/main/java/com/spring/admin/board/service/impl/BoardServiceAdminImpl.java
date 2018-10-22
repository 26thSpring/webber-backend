package com.spring.admin.board.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.admin.board.dao.BoardDAOAdmin;
import com.spring.admin.board.service.BoardServiceAdmin;
import com.spring.admin.paging.BoardPaging;
import com.spring.admin.paging.NoticePaging;
import com.spring.board.vo.BoardVo2;

@Service("boardServiceAdmin")
public class BoardServiceAdminImpl implements BoardServiceAdmin {
	@Autowired
	BoardDAOAdmin boardDaoAdmin;

	@Override
	public List<BoardVo2> getListAll(HashMap<String, Object> map) {
		int pagetotalcount = 10;
		int pagecount = 10;

		map.put("pagecount", pagecount); // db 에 전달하려고 보관

		// 실제 db 조회 menu_id, nowpage, pagecount
		List<BoardVo2> list = boardDaoAdmin.getListAll(map);

		/* 페이징을 위한 정보 처리 */
		int nowpage = Integer.parseInt((String) map.get("nowpage"));
		int pagegrpnum = Integer.parseInt((String) map.get("pagegrpnum"));
		int totalcount = Integer.parseInt(String.valueOf(map.get("totalcount")));

		BoardPaging bp = new BoardPaging(nowpage, pagecount, totalcount, pagetotalcount, pagegrpnum);
		BoardVo2 page = bp.getPagingInfo();
		map.put("page", page);

		return list;
	}

	@Override
	public List<BoardVo2> getNotice(HashMap<String, Object> map) {
		int pagetotalcount = 10;
		int pagecount = 10;

		List<BoardVo2> list = boardDaoAdmin.getNotice(map);
		map.put("pagecount", pagecount); // db 에 전달하려고 보관

		int nowpage = Integer.parseInt((String) map.get("nowpage"));
		int pagegrpnum = Integer.parseInt((String) map.get("pagegrpnum"));
		int totalcount = Integer.parseInt(String.valueOf(map.get("totalcount")));

		NoticePaging np = new NoticePaging(nowpage, pagecount, totalcount, pagetotalcount, pagegrpnum);
		BoardVo2 page = np.getPagingInfo();
		map.put("page", page);

		return list;
	}

	@Override
	public void noticeWrite(HashMap<String, Object> map) {
		boardDaoAdmin.noticeWrite(map);
	}

	@Override
	public BoardVo2 getNoticeView(HashMap<String, Object> map) {
		BoardVo2 vo = boardDaoAdmin.getNoticeView(map);
		return vo;
	}

	@Override
	public void updateNotice(HashMap<String, Object> map) {
		boardDaoAdmin.updateNotice(map);
	}

	@Override
	public void deleteNotice(HashMap<String, Object> map) {
		boardDaoAdmin.deleteNotice(map);
	}

	@Override
	public BoardVo2 getBoardView(HashMap<String, Object> map) {
		BoardVo2 vo = boardDaoAdmin.getBoardView(map);
		return vo;
	}

	@Override
	public void deleteBoard(HashMap<String, Object> map) {
		boardDaoAdmin.deleteBoard(map);
	}
}
