package com.test.dto;

public class RepleDTO {
	/*
	 * RNO      NOT NULL NUMBER(10)   
		BOARDNUM          VARCHAR2(50) 
		RCONTENT          VARCHAR2(50) 
		RWRITER           VARCHAR2(50) 
	 */
	private int rno;
	private String boardnum;
	private String rcontent;
	private String rwriter;
	
	public RepleDTO() {
		// TODO Auto-generated constructor stub
	}

	public RepleDTO(int rno, String boardnum, String rcontent, String rwriter) {
		super();
		this.rno = rno;
		this.boardnum = boardnum;
		this.rcontent = rcontent;
		this.rwriter = rwriter;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getBoardnum() {
		return boardnum;
	}

	public void setBoardnum(String boardnum) {
		this.boardnum = boardnum;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public String getRwriter() {
		return rwriter;
	}

	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}
	
	
}
