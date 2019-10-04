package com.virt.prob2;

public class Student implements NCCCadet {
	String name;
	String roll;
	String branch;
	String rank;
	String zone;

	public Student(String name, String roll, String branch, String rank, String zone) {
		super();
		this.name = name;
		this.roll = roll;
		this.branch = branch;
		this.rank = rank;
		this.zone = zone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public static void main(String[] args) {
		Student s = new Student("maa", "5995", "Campus","1","east");
		System.out.println(s.getRank());
	}

}
