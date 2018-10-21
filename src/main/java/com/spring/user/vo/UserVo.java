package com.spring.user.vo;

import java.util.List;

import com.spring.template.vo.TemplateVo;

public class UserVo {
	//fields
	private String email;
	private String nickname;
	private String thumbnail;
	private String intro;
	private int     auth;
	private String  accessToken;
	private String  socialType;
	private List<TemplateVo> templateList;
	
	//getter&setter
	
	public String getSocialType() {
		return socialType;
	}
	public List<TemplateVo> getTemplateList() {
		return templateList;
	}
	public void setTemplateList(List<TemplateVo> templateList) {
		this.templateList = templateList;
	}
	public void setSocialType(String socialType) {
		this.socialType = socialType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	//constructor	
	public UserVo(String email, String nickname, String thumbnail, String intro, int auth, String accessToken,
			String socialType) {
		
		this.email = email;
		this.nickname = nickname;
		this.thumbnail = thumbnail;
		this.intro = intro;
		this.auth = auth;
		this.accessToken = accessToken;
		this.socialType = socialType;
	}
	public UserVo(){}
	@Override
	public String toString() {
		return "UserVo [email=" + email + ", nickname=" + nickname + ", thumbnail=" + thumbnail + ", intro=" + intro
				+ ", auth=" + auth + ", accessToken=" + accessToken + ", socialType=" + socialType + "]";
	}
	
	
	
	
	
	
}
