package com.jsp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("i m in service");
	String un= req.getParameter("uname");
	System.out.println("User Name is-"+un);
	String ps= req.getParameter("password");
	System.out.println("Password is-"+ps);
	boolean iscorrect= false;
	if ("jbk".equals(un) && "jbk".equals(ps) ) {
		ArrayList<String> al= new ArrayList<>();
		al.add("aa");
		al.add("bb");
		req.setAttribute("data", al);
		iscorrect= true;
	}
	RequestDispatcher rd=null;
	if(iscorrect) {
		rd=req.getRequestDispatcher("inbox.jsp");
	}else {
		req.setAttribute("meg", "Invalide User Name or Password");
		rd=req.getRequestDispatcher("login.jsp");
	}
   rd.forward(req, res);
     
 }
}
