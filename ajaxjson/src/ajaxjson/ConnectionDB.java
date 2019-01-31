package ajaxjson;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

	public static Connection logindatabase()
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/servletjdbc?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
		String user="root";
		String password="12345677";
		
		try 
		{	
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			System.out.println(conn);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;	
	}
	
}
