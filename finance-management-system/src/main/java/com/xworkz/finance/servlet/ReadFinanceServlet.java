package com.xworkz.finance.servlet;

import com.xworkz.finance.entity.FinanceEntity;
import com.xworkz.finance.service.FinanceService;
import com.xworkz.finance.service.FinanceServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readAllFinance")
public class ReadFinanceServlet extends HttpServlet {
    FinanceService service=new FinanceServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("invoking doget method");
        List<FinanceEntity> list= service.validateAndFindAllFinanceEntity();
        System.out.println("list in servlet class "+list);
        req.setAttribute("list", list);

        RequestDispatcher dispatcher = req.getRequestDispatcher("readfinance.jsp");
        dispatcher.forward(req, resp);

        //super.doGet(req, resp);
    }
}
