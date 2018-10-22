package com.spring.admin.paging;

import com.spring.template.vo.TemplateVo2;

public class TemplatePaging {
	private int totalCount;
	private int nowPage;
	private int preNowPage;
	private int nextNowPage;
	private int pageCount;

	private int pageTotalCount;
	private int pageGrpNum;
	private int startPageNum;
	private int endPageNum;
	private int totalRecordPageCount;

	private boolean isshowPagePrev = true;
	private boolean isshowPageNext = true;

	public TemplatePaging() {

	}

	public TemplatePaging(int nowpage, int pagecount, int totalcount, int pagetotalcount, int pagegrpnum) {
		this.nowPage = nowpage;
		this.pageCount = pagecount;
		this.totalCount = totalcount;
		this.pageTotalCount = pagetotalcount;
		this.pageGrpNum = pagegrpnum;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getPreNowPage() {
		return preNowPage;
	}

	public void setPreNowPage(int preNowPage) {
		this.preNowPage = preNowPage;
	}

	public int getNextNowPage() {
		return nextNowPage;
	}

	public void setNextNowPage(int nextNowPage) {
		this.nextNowPage = nextNowPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}

	public int getPageGrpNum() {
		return pageGrpNum;
	}

	public void setPageGrpNum(int pageGrpNum) {
		this.pageGrpNum = pageGrpNum;
	}

	public int getStartPageNum() {
		return startPageNum;
	}

	public void setStartPageNum(int startPageNum) {
		this.startPageNum = startPageNum;
	}

	public int getEndPageNum() {
		return endPageNum;
	}

	public void setEndPageNum(int endPageNum) {
		this.endPageNum = endPageNum;
	}

	public int getTotalRecordPageCount() {
		return totalRecordPageCount;
	}

	public void setTotalRecordPageCount(int totalRecordPageCount) {
		this.totalRecordPageCount = totalRecordPageCount;
	}

	public boolean isIsshowPagePrev() {
		return isshowPagePrev;
	}

	public void setIsshowPagePrev(boolean isshowPagePrev) {
		this.isshowPagePrev = isshowPagePrev;
	}

	public boolean isIsshowPageNext() {
		return isshowPageNext;
	}

	public void setIsshowPageNext(boolean isshowPageNext) {
		this.isshowPageNext = isshowPageNext;
	}

	public TemplateVo2 getPagingInfo() {
		TemplateVo2 vo = new TemplateVo2();
		
		this.totalRecordPageCount = (int) Math.ceil((double) totalCount / (double) pageCount);
		this.startPageNum = (pageGrpNum - 1) * pageTotalCount + 1;
		this.endPageNum = totalRecordPageCount < (pageGrpNum * pageTotalCount) ? totalRecordPageCount
				: (pageGrpNum * pageTotalCount);

		if (startPageNum == 1)
			isshowPagePrev = false;
		
		if (endPageNum >= totalRecordPageCount)
			isshowPageNext = false;

		this.preNowPage = startPageNum - 1;
		this.nextNowPage = endPageNum + 1;

		vo.setNowpage(this.nowPage);
		vo.setPrevnowpage(this.preNowPage);
		vo.setNextnowpage(this.nextNowPage);

		vo.setTotalcount(this.totalCount);
		vo.setTotalpagecount(this.pageTotalCount);
		vo.setPagestartnum(this.startPageNum);
		vo.setPageendnum(this.endPageNum);
		vo.setPagecount(this.pageCount);
		vo.setPagegrpnum(this.pageGrpNum);

		vo.setIsshowpagenext(isshowPageNext);
		vo.setIsshowpageprev(isshowPagePrev);

		return vo;
	}

}
