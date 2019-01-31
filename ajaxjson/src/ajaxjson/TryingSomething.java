package ajaxjson;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")

public class TryingSomething  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET CONNECTION
		Connection conn=ConnectionDB.logindatabase();
		
		String ajaxdata="";
		String Name=req.getParameter("Name");
		String LastName=req.getParameter("LastName");
		int Age=0;
		try {
			Age=Integer.valueOf(req.getParameter("Age"));
		}
		catch (NumberFormatException e) {
		}
		
		
		InsertDatabase insert=new InsertDatabase();
		insert.addvalues(conn, Age, Name, LastName);
			
	    RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
	    dispatcher.forward(req, resp);
		
	}
	
	
	

}
