package ajaxjson;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConvert extends HttpServlet{

	static GetData getdata=new GetData();
	
	public String convert() {
		
		List<Information> list=new ArrayList<>();
		list=getdata.findalldata();
		
		//datayý json'a çevirme 

		String ajaxdata="";
		
		Gson gson=new GsonBuilder().create();
		ajaxdata=gson.toJson(list);
		
		System.out.println(ajaxdata);
		
		return ajaxdata;
		
		

	}
		
		
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getName() + " " + list.get(i).getLastName() + " " + list.get(i).getAge());
//			System.out.println();
//		}
	}
	
	
	

