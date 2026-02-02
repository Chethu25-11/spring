package com.xworkz.banking.servlet;

import com.xworkz.banking.entity.BankEntity;
import com.xworkz.banking.service.BankService;
import com.xworkz.banking.service.BankServiceImpl;
import lombok.experimental.UtilityClass;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/anything")
public class RegisterServlet extends HttpServlet {
    BankService service = new BankServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  int customerId = Integer.parseInt(req.getParameter("customerId"));
        String name = req.getParameter("name");
        Long accountNumber = Long.valueOf(req.getParameter("accountNumber"));
        Double amount = Double.valueOf(req.getParameter("amount"));

        BankEntity entity = new BankEntity();
     //entity.setCustomerId(customerId);
        entity.setName(name);
        entity.setAccountNumber(accountNumber);
        entity.setAmount(amount);

        BankEntity save = service.validateAndSaveBankInfo(entity);
      //req.setAttribute("customerId", customerId);
        req.setAttribute("name",name);
        req.setAttribute("accountNumber",accountNumber);
        req.setAttribute("amount",amount);
        List<BankEntity> entityList=service.validateAndFindAllBankEntity();
        req.setAttribute("list", entityList);
       // req.setAttribute("customerId",customerId);
        req.setAttribute("name",name);
        req.setAttribute("accountNumber",accountNumber);
        req.setAttribute("amount",amount);
        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);
    }
}
