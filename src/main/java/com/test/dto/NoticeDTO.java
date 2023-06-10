package com.test.dto;

import java.sql.Timestamp;

public class NoticeDTO {
	/*
	 * NTNO      NOT NULL NUMBER(20)     
		NTTITLE   NOT NULL VARCHAR2(30)   
		NTCONTENT          VARCHAR2(1000) 
		NTREGDATE          DATE           
		NTHIT              NUMBER(38)    
	 */
	private int ntno;
	private String ntitle;
	private String ntcontent;
	private Timestamp ntregdate;
	private int nthit;
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}

	public NoticeDTO(int ntno, String ntitle, String ntcontent, Timestamp ntregdate, int nthit) {
		super();
		this.ntno = ntno;
		this.ntitle = ntitle;
		this.ntcontent = ntcontent;
		this.ntregdate = ntregdate;
		this.nthit = nthit;
	}

	public int getNtno() {
		return ntno;
	}

	public void setNtno(int ntno) {
		this.ntno = ntno;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNtcontent() {
		return ntcontent;
	}

	public void setNtcontent(String ntcontent) {
		this.ntcontent = ntcontent;
	}

	public Timestamp getNtregdate() {
		return ntregdate;
	}

	public void setNtregdate(Timestamp ntregdate) {
		this.ntregdate = ntregdate;
	}

	public int getNthit() {
		return nthit;
	}

	public void setNthit(int nthit) {
		this.nthit = nthit;
	}
	
	
}
