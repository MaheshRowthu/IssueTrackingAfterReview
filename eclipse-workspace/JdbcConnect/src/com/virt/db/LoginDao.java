package com.virt.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(String name1,String pass1){
		boolean status=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			
			Statement ps=con.createStatement();
			ps.setString(1,name1);
			ps.setString(2,pass1);
			
			ResultSet rs=ps.executeQuery("select * from userreg where name=? and pass=?");
			status=rs.next();
			
			
		}catch(Exception e){System.out.println(e);}
		return status;
		}
}
