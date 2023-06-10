package com.test.dto;

public class HobbyDTO {	
	/*
	 * HNO   NOT NULL NUMBER(10)   
		HNAME          VARCHAR2(50) 
	 */
	
	private int hno;
	private String hname;
	
	public HobbyDTO() {
		// TODO Auto-generated constructor stub
	}

	public HobbyDTO(int hno, String hname) {
		super();
		this.hno = hno;
		this.hname = hname;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}
	
	
}
