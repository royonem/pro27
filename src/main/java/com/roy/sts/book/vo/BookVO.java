package com.roy.sts.book.vo;

import org.springframework.stereotype.Component;

@Component("bookVO")
public class BookVO {
	private int	num;
	private String studyDate;
	private String studyTitle;
	private String studyDetails;
	private int totalChapters;

	public BookVO() {
	}
	
	public BookVO(int num, String studyDate, String studyTitle,  String studyDetails, int totalChapters) {
		this.num = num;
		this.studyDate = studyDate;
		this.studyTitle = studyTitle;
		this.studyDetails = studyDetails;
		this.totalChapters = totalChapters;

	}
	

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(String studyDate) {
		this.studyDate = studyDate;
	}

	public String getStudyTitle() {
		return studyTitle;
	}

	public void setStudyTitle(String studyTitle) {
		this.studyTitle = studyTitle;
	}

	public int getTotalChapters() {
		return totalChapters;
	}

	public void setTotalChapters(int totalChapters) {
		this.totalChapters = totalChapters;
	}

	public String getStudyDetails() {
		return studyDetails;
	}

	public void setStudyDetails(String studyDetails) {
		this.studyDetails = studyDetails;
	}
}

