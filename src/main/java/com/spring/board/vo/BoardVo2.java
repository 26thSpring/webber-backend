package com.spring.board.vo;

import java.util.List;

import com.spring.reply.vo.ReplyVo;

public class BoardVo2 {
	// fields
	private String board_id;
	private String nickname;
	private String title;
	private String content;
	private int views;
	private String regdate;
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

	public String getBoard_id() {
		return board_id;
	}

	public void setBoard_Id(String board_id) {
		this.board_id = board_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
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

	@Override
	public String toString() {
		return "BoardVo [board_Id=" + board_id + ", nickname=" + nickname + ", title=" + title + ", content=" + content
				+ ", views=" + views + ", regdate=" + regdate + ", replies=" + replies + ", nowpage=" + nowpage
				+ ", prevnowpage=" + prevnowpage + ", nextnowpage=" + nextnowpage + ", totalcount=" + totalcount
				+ ", totalpagecount=" + totalpagecount + ", pagestartnum=" + pagestartnum + ", pageendnum=" + pageendnum
				+ ", pagegrpnum=" + pagegrpnum + ", pagecount=" + pagecount + ", isshowpageprev=" + isshowpageprev
				+ ", isshowpagenext=" + isshowpagenext + "]";
	}
	
	
}
