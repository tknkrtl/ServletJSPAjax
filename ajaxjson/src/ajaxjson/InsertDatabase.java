package ajaxjson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDatabase {

	private final String ADDPRODUCT="insert into information(Name,LastName,Age) values (?,?,?)";
	
	public void addvalues(Connection conn,int Age,String Name,String LastName)
	{
		try {
			PreparedStatement ps=conn.prepareStatement(ADDPRODUCT);
			ps.setString(1, Name);
			ps.setString(2, LastName);
			ps.setInt(3, Age);
			ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
