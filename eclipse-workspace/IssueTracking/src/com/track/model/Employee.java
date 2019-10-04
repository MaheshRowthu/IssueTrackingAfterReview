package com.track.model;

public class Employee {
	private int empid;
	private String empname;
	private String mail;
	private String password;
	private int phno;
	private String address;
	private String desg;
	private String emptype;
	public Employee(int empid, String empname, String mail, String password, int phno, String address, String desg, String emptype) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.mail = mail;
		this.password = password;
		this.phno = phno;
		this.address = address;
		this.desg = desg;
		this.emptype=emptype;
	}
	
	public Employee( String mail, String password, String emptype) {
		super();
		this.mail = mail;
		this.password = password;
		this.emptype=emptype;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	


	public String getEmptype() {
		return emptype;
	}

	public void setEmptype(String emptype) {
		this.emptype = emptype;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	
}
