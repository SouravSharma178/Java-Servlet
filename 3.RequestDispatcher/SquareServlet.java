/* flow of the code
1.First the HTML code runs 
2.When submit button is clicked it looks into the web.xml file to know which url is mapped to which servlet
3.That particular servlet is called 
4.Now to perform further operations we forward the request from one servlet to another and transfer value of variables using req.setAttribute()
5.The value is passed to the next servlet which performs the further operations
 */
package com.sourav;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SquareServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{

// since req and res objects are common in both the servlets we will store the k value in them inorder to send the value of k

// since this is an object we will have to typecast this to an integer	

int k = (int) req.getAttribute("k");	
k = (int) Math.pow(k, 2);
	PrintWriter out = res.getWriter();
	out.println("The square is i and j is "+k);
}
}
