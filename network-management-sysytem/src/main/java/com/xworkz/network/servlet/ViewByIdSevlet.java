package com.xworkz.network.servlet;

import com.xworkz.network.entity.UserInfoEntity;
import com.xworkz.network.service.ComplaintService;
import com.xworkz.network.service.ComplaintServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/viewById")
public class ViewByIdSevlet extends HttpServlet {
    ComplaintService service=new ComplaintServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("id"));
       UserInfoEntity entity= service.validateAndFindById(Integer.parseInt(req.getParameter("id")));
        System.out.println("entity found:"+entity);
        req.setAttribute("entity", entity);
        req.getRequestDispatcher("viewById.jsp").forward(req, resp);
    }
}
