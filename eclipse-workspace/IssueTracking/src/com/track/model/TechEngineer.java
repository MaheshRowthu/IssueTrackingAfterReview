package com.track.model;

public class TechEngineer {
	private int techId;
	private String techName;
	private String mail;
	private String password;
	private int phno;
	private String address;
	private String role;

	public TechEngineer(int techid, String techname, String mail, String password, int phno, String address,
			String role) {
		super();
		this.techId = techid;
		this.techName = techname;
		this.mail = mail;
		this.password = password;
		this.phno = phno;
		this.address = address;
		this.role = role;
	}

	public TechEngineer(int techEngId, String techEngName) {
		techId = techEngId;
		techName = techEngName;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

}
