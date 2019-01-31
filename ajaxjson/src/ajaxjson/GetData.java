package ajaxjson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GetData {

	private final String ALL="select * from information";
	public List<Information> findalldata ()
	{
		
		List<Information> alldata=new ArrayList<Information>();
		
		try {
			Connection conn=ConnectionDB.logindatabase();
			PreparedStatement ps=conn.prepareStatement(ALL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String Name=rs.getString("Name");
				String LastName=rs.getString("LastName");
				int Age=rs.getInt("Age");
				
				Information i=new Information(Name, LastName, Age);
				alldata.add(i);			
			}
			conn.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alldata; 
		
		
	}
	
}
