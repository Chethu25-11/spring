package com.xworkz.network.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

import com.xworkz.network.entity.UserInfoEntity;
import com.xworkz.network.service.ComplaintService;
import com.xworkz.network.service.ComplaintServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    ComplaintService service = new ComplaintServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Invoking doPost method");

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String role = req.getParameter("role");

        UserInfoEntity entity = new UserInfoEntity();

        entity.setEmail(email);
        entity.setPassword(password);
        entity.setRole(role);

       UserInfoEntity saved = service.validateAndSaveUserInfo(entity);
        req.setAttribute("email", email);
        req.setAttribute("password", password);
        req.setAttribute("role", role);
        List<UserInfoEntity> userInfoEntity = service.validateAndFindAllUserInfoEntity();
        req.setAttribute("email",email);
        req.setAttribute("password", password);
        req.setAttribute("role", role);
        RequestDispatcher indexDispatcher = req.getRequestDispatcher("success.jsp");
        indexDispatcher.forward(req, resp);
    }
}
