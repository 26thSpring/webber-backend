package com.spring.user.vo;

public class UserVO2 {
	/* email, nick_name, thumbnail, intro, google, facebook, naver, delnum */
	private String email;
	private String nick_name;
	private String thumbnail;
	private String intro;
	private String google;
	private String facebook;
	private String naver;
	private String delnum;

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

	public UserVO2() {
	}

	public UserVO2(String email, String nick_name, String thumbnail, String intro, String google, String facebook,
			String naver, String delnum) {
		this.email = email;
		this.nick_name = nick_name;
		this.thumbnail = thumbnail;
		this.intro = intro;
		this.google = google;
		this.facebook = facebook;
		this.naver = naver;
		this.delnum = delnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getGoogle() {
		return google;
	}

	public void setGoogle(String google) {
		this.google = google;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getNaver() {
		return naver;
	}

	public void setNaver(String naver) {
		this.naver = naver;
	}

	public String getDelnum() {
		return delnum;
	}

	public void setDelnum(String delnum) {
		this.delnum = delnum;
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
