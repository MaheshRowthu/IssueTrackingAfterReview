package com.log.in;

public class Login {
	
public static void main(String[] args) {
	String name="mahesh";
	String pass="sairam";
	boolean status;
	LoginDao logindao=new LoginDao();
	if(logindao.validate(name,pass)) {
		System.out.println("Succeed");
	}
	else {
		System.out.println("Fail");
	}
}
}
