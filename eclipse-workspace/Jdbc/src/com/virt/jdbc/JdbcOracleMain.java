package com.virt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOracleMain {

	public static void main(String[] args) {
//  		private static Logger log=Logger.getRootLogger
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while (rs.next()) {
				System.out.println();
				System.out.println(rs.getString(1) + ":" + rs.getString(2) + "  " + rs.getString(3));
				rs.getBigDecimal(1);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
