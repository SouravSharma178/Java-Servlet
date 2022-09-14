package com.sourav;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class POSTServlet extends HttpServlet{
	
// here we have used the doPost method as we only want to allow the requests from the POST method
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException  {

	int i = Integer.parseInt(req.getParameter("number1"));
	int j = Integer.parseInt(req.getParameter("number2"));
	
	
// When we click on the submit button it checks what type of data we are passing(whether get or post),then it goes to the web.xml file and checks the url and maps it to a servlet class but since we are extending the HTTP servlet class we are still internally making use of the service method.So the request is still internally going to the service method.
	
	
int k = i+j;	

PrintWriter out = res.getWriter();
out.println("The result is "+k);

}

}
