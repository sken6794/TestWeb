package com.test.dto;

import java.sql.Timestamp;

public class HboardDTO {
	/*
	 * BOARDNUM     NOT NULL NUMBER(10)     
		MEMID                 VARCHAR2(50)   
		HNO                   NUMBER(10)     
		BWRITER               VARCHAR2(50)   
		BOARDTITLE            VARCHAR2(50)   
		BOARDCONTENT          VARCHAR2(1000) 
		BOARDHIT              NUMBER(38)     
		BOARDREGDATE          DATE 
	 */
	private int boardnum;
	private String memid;
	private int hno;
	private String bwriter; 
	private String boardtitle;
	private String boardcontent;
	private int boardhit;
	private Timestamp boardregdate;
	
	public HboardDTO() {
		// TODO Auto-generated constructor stub
	}

	public HboardDTO(int boardnum, String memid, int hno, String bwriter, String boardtitle, String boardcontent,
			int boardhit, Timestamp boardregdate) {
		super();
		this.boardnum = boardnum;
		this.memid = memid;
		this.hno = hno;
		this.bwriter = bwriter;
		this.boardtitle = boardtitle;
		this.boardcontent = boardcontent;
		this.boardhit = boardhit;
		this.boardregdate = boardregdate;
	}

	public int getBoardnum() {
		return boardnum;
	}

	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getBoardcontent() {
		return boardcontent;
	}

	public void setBoardcontent(String boardcontent) {
		this.boardcontent = boardcontent;
	}

	public int getBoardhit() {
		return boardhit;
	}

	public void setBoardhit(int boardhit) {
		this.boardhit = boardhit;
	}

	public Timestamp getBoardregdate() {
		return boardregdate;
	}

	public void setBoardregdate(Timestamp boardregdate) {
		this.boardregdate = boardregdate;
	}
	
	
}
