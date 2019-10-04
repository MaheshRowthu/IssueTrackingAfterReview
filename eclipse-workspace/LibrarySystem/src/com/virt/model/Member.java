package com.virt.model;

public abstract class Member {
	private int memberId;
	private String name;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Member.nextId = nextId;
	}
	public int getMemberId() {
		return memberId;
	}
	private static int nextId=101;
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	}

//      right-2