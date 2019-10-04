package com.run.sound;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginCheck {

	public boolean validate(String name, String pass) {
		Boolean status=false;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			String query = "select name,pass from userreg where name=? and pass=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();
			//System.out.println(rs);
			if (rs.next()) {
				status= true;
			}
			return status;
		} catch (Exception e) {
			e.printStackTrace();
			return status;
		} 
	}
}
