package com.spring.template.vo;

import java.util.List;

import com.spring.reply.vo.ReplyVo;

public class TemplateVo2 {
	private String template_id;
	private String nickname;
	private String file_name;
	private String file_path_html;
	private String file_path_css;
	private String thumbnail;
	private String htmlContent;
	private String cssContent;
	private int views;
	private int likes;
	private String regdate;
	private int favor;
	private List<ReplyVo> replies;

	// 페이징관련정보
	private int nowpage; // 현재 페이지 정보
	private int prevnowpage; // 이전 10개 클릭시 적용되는 nowpage
	private int nextnowpage; // 다음 10개 클릭시 적용되는 nowpage

	private int totalcount; // 전체 Row 수
	private int totalpagecount; // 화면에 보여줄 페이지 수

	private int pagestartnum; // 화면에 보여줄 페이지 시작 번호
	private int pageendnum; // 화면에 보여줄 페이지 끝 번호
	private int pagegrpnum; // 페이지 그룹 숫자

	private int pagecount; // 1 페이지에 보여줄 자료라인수

	private boolean isshowpageprev;
	private boolean isshowpagenext;

	public TemplateVo2(String template_id, String nickname, String file_name, String file_path_html,
			String file_path_css, String thumbnail, String htmlContent, String cssContent, int views, int likes,
			String regdate, int favor, List<ReplyVo> replies, int nowpage, int prevnowpage, int nextnowpage,
			int totalcount, int totalpagecount, int pagestartnum, int pageendnum, int pagegrpnum, int pagecount,
			boolean isshowpageprev, boolean isshowpagenext) {
		super();
		this.template_id = template_id;
		this.nickname = nickname;
		this.file_name = file_name;
		this.file_path_html = file_path_html;
		this.file_path_css = file_path_css;
		this.thumbnail = thumbnail;
		this.htmlContent = htmlContent;
		this.cssContent = cssContent;
		this.views = views;
		this.likes = likes;
		this.regdate = regdate;
		this.favor = favor;
		this.replies = replies;
		this.nowpage = nowpage;
		this.prevnowpage = prevnowpage;
		this.nextnowpage = nextnowpage;
		this.totalcount = totalcount;
		this.totalpagecount = totalpagecount;
		this.pagestartnum = pagestartnum;
		this.pageendnum = pageendnum;
		this.pagegrpnum = pagegrpnum;
		this.pagecount = pagecount;
		this.isshowpageprev = isshowpageprev;
		this.isshowpagenext = isshowpagenext;
	}

	public TemplateVo2() {
	}

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getFile_path_html() {
		return file_path_html;
	}

	public void setFile_path_html(String file_path_html) {
		this.file_path_html = file_path_html;
	}

	public String getFile_path_css() {
		return file_path_css;
	}

	public void setFile_path_css(String file_path_css) {
		this.file_path_css = file_path_css;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}

	public String getCssContent() {
		return cssContent;
	}

	public void setCssContent(String cssContent) {
		this.cssContent = cssContent;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getFavor() {
		return favor;
	}

	public void setFavor(int favor) {
		this.favor = favor;
	}

	public List<ReplyVo> getReplies() {
		return replies;
	}

	public void setReplies(List<ReplyVo> replies) {
		this.replies = replies;
	}

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public int getPrevnowpage() {
		return prevnowpage;
	}

	public void setPrevnowpage(int prevnowpage) {
		this.prevnowpage = prevnowpage;
	}

	public int getNextnowpage() {
		return nextnowpage;
	}

	public void setNextnowpage(int nextnowpage) {
		this.nextnowpage = nextnowpage;
	}

	public int getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public int getTotalpagecount() {
		return totalpagecount;
	}

	public void setTotalpagecount(int totalpagecount) {
		this.totalpagecount = totalpagecount;
	}

	public int getPagestartnum() {
		return pagestartnum;
	}

	public void setPagestartnum(int pagestartnum) {
		this.pagestartnum = pagestartnum;
	}

	public int getPageendnum() {
		return pageendnum;
	}

	public void setPageendnum(int pageendnum) {
		this.pageendnum = pageendnum;
	}

	public int getPagegrpnum() {
		return pagegrpnum;
	}

	public void setPagegrpnum(int pagegrpnum) {
		this.pagegrpnum = pagegrpnum;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}

	public boolean isIsshowpageprev() {
		return isshowpageprev;
	}

	public void setIsshowpageprev(boolean isshowpageprev) {
		this.isshowpageprev = isshowpageprev;
	}

	public boolean isIsshowpagenext() {
		return isshowpagenext;
	}

	public void setIsshowpagenext(boolean isshowpagenext) {
		this.isshowpagenext = isshowpagenext;
	}

}
