package com.xworkz.onlinepayments.servlet;

import com.xworkz.onlinepayments.entity.UserEntity;
import com.xworkz.onlinepayments.service.PaymentService;
import com.xworkz.onlinepayments.service.PaymentServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    PaymentService service = new PaymentServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 String email=req.getParameter("emailId");
String psw= req.getParameter("psw");
String repeat= req.getParameter("rpsw");
 long pnum= Long.parseLong(req.getParameter("phoneNumber"));
//        System.out.println("emailId" +email);
//        System.out.println("psw" +psw);
//        System.out.println("rpsw" +repeat);
//        System.out.println("phoneNumber" +pnum);
        UserEntity entity = new UserEntity();
        entity.setEmailId(email);
        entity.setPassword(psw);
        entity.setPhoneNumber(pnum);

       UserEntity saved=  service.validateAndSavePaymentInfo(entity);
//       req.setAttribute("email", email);
//        req.setAttribute("password", psw);
//        req.setAttribute("phoneNumber", pnum);

// service.validateAndFindAllUserEntity();
        req.setAttribute("email", email);
        req.setAttribute("password", psw);
        req.setAttribute("phoneNumber", pnum);
        req.getRequestDispatcher("after.jsp").forward(req, resp);
//    UserEntity saved = service.validateAndSavePaymentInfo(entity);
//         super.doPost(req, resp);

    }
}
