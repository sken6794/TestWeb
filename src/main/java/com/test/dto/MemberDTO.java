package com.test.dto;

public class MemberDTO {
	/*
	 * MEMID     NOT NULL VARCHAR2(50)  
		MEMPW              VARCHAR2(30)  
		MEMNAME            VARCHAR2(30)  
		MEMPHONE           VARCHAR2(30)  
		MEMADDR            VARCHAR2(100) 
		MEMGENDER          VARCHAR2(10)  
		MEMBIRTH           VARCHAR2(15)  
		MEMTYPE            VARCHAR2(30) 
	 */
	private String memid;
	private String mempw;
	private String memname;
	private String memphone;
	private String memaddr;
	private String memgender;
	private String membirth;
	private String memtype;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String memid, String mempw, String memname, String memphone, String memaddr, String memgender,
			String membirth, String memtype) {
		super();
		this.memid = memid;
		this.mempw = mempw;
		this.memname = memname;
		this.memphone = memphone;
		this.memaddr = memaddr;
		this.memgender = memgender;
		this.membirth = membirth;
		this.memtype = memtype;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getMempw() {
		return mempw;
	}

	public void setMempw(String mempw) {
		this.mempw = mempw;
	}

	public String getMemname() {
		return memname;
	}

	public void setMemname(String memname) {
		this.memname = memname;
	}

	public String getMemphone() {
		return memphone;
	}

	public void setMemphone(String memphone) {
		this.memphone = memphone;
	}

	public String getMemaddr() {
		return memaddr;
	}

	public void setMemaddr(String memaddr) {
		this.memaddr = memaddr;
	}

	public String getMemgender() {
		return memgender;
	}

	public void setMemgender(String memgender) {
		this.memgender = memgender;
	}

	public String getMembirth() {
		return membirth;
	}

	public void setMembirth(String membirth) {
		this.membirth = membirth;
	}

	public String getMemtype() {
		return memtype;
	}

	public void setMemtype(String memtype) {
		this.memtype = memtype;
	}
	
}
