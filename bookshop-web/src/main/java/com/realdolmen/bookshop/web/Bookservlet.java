package com.realdolmen.bookshop.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.realdolmen.bookshop.Book;

@WebServlet(urlPatterns="/book")
public class Bookservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		Book book = new Book("Yanto Maes", "Super Awesome Book", "123456789");
		resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.println(book.getTitle());
	}
}