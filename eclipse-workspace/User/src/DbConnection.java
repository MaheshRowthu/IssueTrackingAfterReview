
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {
	static Connection conn;
	public PreparedStatement ps;
	public Statement st;
	public ResultSet rs;

	
		
		public static Connection getConnection()
		{
			try
			{
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
				return conn;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
		
	}


