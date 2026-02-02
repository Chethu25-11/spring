package com.xworkz.banking.servlet;

import com.xworkz.banking.entity.BankEntity;
import com.xworkz.banking.service.BankService;
import com.xworkz.banking.service.BankServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(urlPatterns = "/readAlluserInfo")
public class ReadServlet extends HttpServlet {
    BankService service = new BankServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BankEntity> list=service.validateAndFindAllBankEntity();
        System.out.println("list "+list);
        req.setAttribute("list", list);
        //super.doGet(req, resp);
        RequestDispatcher dispatcher = req.getRequestDispatcher("read.jsp");
        dispatcher.forward(req, resp);
    }
}
