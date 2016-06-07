package com.blogspot.geekabyte.sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;


/**
 * Created by wospina on 03/06/2016.
 */
@WebServlet(value="/hello")
public class HelloWorld extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        res.getWriter().println("Hello World!!!");

    }
}
