package com.polinabohush.audiostore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet("/time")
public class TimeServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
    res.setContentType("text/html; charset=UTF-8");
    String time = getTime();
    res.getWriter().println("<h1>" + time + "</h1>");
  }

  private String getTime()
  {
    return LocalTime.now().toString();
  }
}
