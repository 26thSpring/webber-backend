/* 관리자 페이지 */
package com.spring.admin.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.admin.board.service.BoardServiceAdmin;
import com.spring.admin.board.service.TemplateServiceAdmin;
import com.spring.admin.user.service.UserServiceAdmin;
import com.spring.board.vo.BoardVo2;
import com.spring.template.vo.TemplateVo2;
import com.spring.user.vo.UserVO2;

@Controller
public class AdminController {
	@Autowired
	private UserServiceAdmin userService2;

	@Autowired
	private BoardServiceAdmin boardServiceAdmin;

	@Autowired
	private TemplateServiceAdmin templateServiceAdmin;

	// 전체 게시물 가져오기
	@RequestMapping("/admin/board")
	public ModelAndView getList(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		List<BoardVo2> boardList = boardServiceAdmin.getListAll(map);

		mv.addObject("list", boardList);
		mv.addObject("page", map.get("page")); // nowpage, pagegrpnum
		mv.setViewName("admin/board");

		return mv;
	}

	@RequestMapping("/admin/board/boardView")
	public ModelAndView boardView(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		BoardVo2 content = boardServiceAdmin.getBoardView(map);

		mv.addObject("content", content);
		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));
		mv.setViewName("admin/boardView");

		return mv;
	}

	@RequestMapping("/admin/board/boardDel")
	public ModelAndView deleteBoard(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		BoardVo2 content = boardServiceAdmin.getNoticeView(map);
		boardServiceAdmin.deleteBoard(map);

		mv.addObject("content", content);
		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));

		mv.setViewName("redirect:/admin/board?nowpage=1&pagecount=10&pagegrpnum=1");

		return mv;
	}

	@RequestMapping("/admin/user")
	public ModelAndView pdsList(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		List<UserVO2> list = userService2.getUserAll(map);
		UserVO2 page = (UserVO2) map.get("page");

		mv.addObject("user", list);
		mv.addObject("page", page); // nowpage, pagegrpnum
		mv.setViewName("admin/user");

		return mv;
	}

	@RequestMapping("/admin/user/info")
	public ModelAndView userInfo(UserVO2 vo) {
		ModelAndView mv = new ModelAndView();
		UserVO2 info = userService2.getUserInfo(vo.getNick_name());

		mv.addObject("info", info);
		mv.setViewName("admin/info");

		return mv;
	}

	@RequestMapping("/admin/user/kick_member")
	public ModelAndView kickMember(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		userService2.kickMember(map);

		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));
		mv.setViewName("redirect:/admin/user?nowpage=1&pagecount=10&pagegrpnum=1");

		return mv;
	}

	@RequestMapping("/admin/templates")
	public ModelAndView templatesManage(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		List<TemplateVo2> list = templateServiceAdmin.getTemplates(map);

		mv.addObject("list", list);
		mv.addObject("page", map.get("page"));
		mv.setViewName("admin/templates");

		return mv;
	}

	@RequestMapping("/admin/templates/getTemplate")
	public ModelAndView getTemplate(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		TemplateVo2 content = templateServiceAdmin.getTemplateContent(map);

		mv.addObject("content", content);
		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));
		mv.setViewName("admin/templateView");
		
		return mv;
	}

	@RequestMapping("/admin/templates/delTemplate")
	public ModelAndView delTemplate(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		templateServiceAdmin.delTemplate(map);

		mv.setViewName("redirect:/admin/templates?nowpage=1&pagecount=5&pagegrpnum=1");
		return mv;
	}

	@RequestMapping("/admin/notice")
	public ModelAndView getNotice(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		List<BoardVo2> notice = boardServiceAdmin.getNotice(map);
		BoardVo2 page = (BoardVo2) map.get("page");

		mv.addObject("notice", notice);
		mv.addObject("page", page);
		mv.addObject("nowpage", map.get("nowpage"));
		mv.setViewName("admin/notice");

		return mv;
	}

	@RequestMapping("/admin/notice/write")
	public ModelAndView writeNotice(@RequestParam HashMap<String, Object> map, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		/* 로그인 정보 */
		HttpSession session = request.getSession();
		// String login_id = (String) session.getAttribute("nickname");
		String login_id = "admin";
		map.put("nickname", login_id);
		// System.out.println(map);

		mv.addObject("map", map);
		mv.setViewName("admin/noticeWrite");

		return mv;
	}

	@RequestMapping("/admin/notice/writeProc")
	public ModelAndView writeNoticeProc(@RequestParam HashMap<String, Object> map) {
		boardServiceAdmin.noticeWrite(map);
		ModelAndView mv = new ModelAndView();

		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));
		mv.setViewName("redirect:/admin/notice?nowpage=1&pagecount=10&pagegrpnum=1");

		return mv;
	}

	@RequestMapping("/admin/notice/noticeView")
	public ModelAndView noticeView(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		BoardVo2 content = boardServiceAdmin.getNoticeView(map);

		mv.addObject("content", content);
		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));
		mv.setViewName("admin/noticeView");

		return mv;
	}

	@RequestMapping("/admin/notice/noticeUpdate")
	public ModelAndView updateNotice(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		boardServiceAdmin.updateNotice(map);

		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));
		mv.setViewName("redirect:/admin/notice?nowpage=1&pagecount=10&pagegrpnum=1");

		return mv;
	}

	@RequestMapping("/admin/notice/noticeDel")
	public ModelAndView deleteNotice(@RequestParam HashMap<String, Object> map) {
		ModelAndView mv = new ModelAndView();
		BoardVo2 content = boardServiceAdmin.getNoticeView(map);
		boardServiceAdmin.deleteNotice(map);

		mv.addObject("content", content);
		mv.addObject("nowpage", map.get("nowpage"));
		mv.addObject("pagegrpnum", map.get("pagegrpnum"));

		mv.setViewName("redirect:/admin/notice?nowpage=1&pagecount=10&pagegrpnum=1");

		return mv;
	}
}
