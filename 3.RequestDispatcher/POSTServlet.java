package com.sourav;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class POSTServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException  {

int i = Integer.parseInt(req.getParameter("number1"));
int j = Integer.parseInt(req.getParameter("number2"));	
int k = i+j;	

// now we will send the value of k from this servlet to the SquareServlet
// since req and res objects are common in both the servlets we will store the k value in them inorder to send the value of k
req.setAttribute("k",k);


// Here we are calling the servlet pqr by using RequestDispatcher,so first we called a method getRequestDispatcher by passing url as the parameter.This url gave us the object of type RequestDispatcher which itself is an interface.So basically we are forwarding the request we get from one servlet to another.In this example,addition of i and j is done by POSTServlet and squaring of K is done by SquareServlet for which we need to transfer the value of k from POSTServlet to SquareServlet

RequestDispatcher rd = req.getRequestDispatcher("square");
rd.forward(req, res);
}}
