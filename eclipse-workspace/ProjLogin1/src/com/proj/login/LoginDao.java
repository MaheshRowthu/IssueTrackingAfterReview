package com.proj.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	public boolean validate(String name, String pass) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			PreparedStatement stmt=null;// 			
			stmt= con.prepareStatement("select * from userreg where name=? and pass=?");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				System.out.println();
				System.out.println(rs.getString(1) + ":" + rs.getString(2) );//+ "  " + rs.getString(3));
				//rs.getBigDecimal(1);
				return true;
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
