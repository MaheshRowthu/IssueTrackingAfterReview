package com.virt.db;

public class CheckLogin {

	public static void main(String[] args) {
		String user = "mahesh", password = "sairam";
		if (LoginDao.validate(user, password)) {
			System.out.println("u r my user");
		} else {
			System.out.println("u r not my user");
		}
	}
}