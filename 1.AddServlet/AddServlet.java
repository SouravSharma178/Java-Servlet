package com.sourav;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// the moment we extend our class using HttpServlet our simple class becomes a servlet
public class AddServlet extends HttpServlet{
	
// we will use the name service as it belongs to the servlet life cycle
	
/* for performing our operations we are going to pass 2 parameters in our service method
1.Request
2.Response 
The objects of request and response would be automatically created by TOMCAT so we just need to create references of these two in our code.
*/	
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException  {
// The below method will give us the output in a String so we must typecast it to an Integer	
//	int i = req.getParameter("number1");
	int i = Integer.parseInt(req.getParameter("number1"));
	int j = Integer.parseInt(req.getParameter("number2"));
	
// Now we are going to add these two numbers
	
int k = i+j;	

// System.out.println will not work here as it will print the output to the console but we want to see the output inside the browser
PrintWriter out = res.getWriter();
out.println("The result is "+k);

//System.out.println(k);

// But still our code is not going to work as TOMCAT is unable to map the add request to the Servlet which performs addition
// so we must configure these mappings inside the deployment descriptor ,the web.xml file
}}
