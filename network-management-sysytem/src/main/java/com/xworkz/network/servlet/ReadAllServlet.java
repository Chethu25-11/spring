package com.xworkz.network.servlet;

import com.xworkz.network.entity.UserInfoEntity;
import com.xworkz.network.service.ComplaintService;
import com.xworkz.network.service.ComplaintServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readAlluser")
public class ReadAllServlet extends HttpServlet {
    ComplaintService service = new ComplaintServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doGet Method");
       List<UserInfoEntity> list =service.validateAndFindAllUserInfoEntity();
        System.out.println("list in servlet class "+list);
        req.setAttribute("list", list);
        RequestDispatcher dispatcher = req.getRequestDispatcher("Read.jsp");
        dispatcher.forward(req, resp);

    }
}
