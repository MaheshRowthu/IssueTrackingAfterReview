import java.sql.SQLException;
import java.util.List;

public class UserDAO {
	public List<User> getAllUser() {
		
		return null;
		//write your code here
	}
	
	public Boolean deleteUser(String username) {
		try {
		DbConnection sc=new DbConnection();
		sc.getConnection();
		String sql = "delete from USER1 where name=?            ";

	         sc.st = sc.conn.createStatement(); 
	      
	      sc.st.executeUpdate(sql);
	      System.out.println("Record deleted successfully");
	    }
	         catch (SQLException e) {
	      e.printStackTrace();
	    }
		return true;
		//write your code here
	}
}
/*
 *  create table user1(id int primary key,name varchar(20),
                   mobile int,
                   username varchar(20),
                   password varchar(20));
insert into user values(101,'john',9876543210,'johny','12345');
            
 * */
 