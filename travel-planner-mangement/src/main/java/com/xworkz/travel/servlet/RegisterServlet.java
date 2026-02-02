package com.xworkz.travel.servlet;

import com.xworkz.travel.entity.TravelEntity;
import com.xworkz.travel.service.TravelService;
import com.xworkz.travel.service.TravelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    TravelService service = new TravelServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//   int id= Integer.parseInt(req.getParameter("id"));
   String name = req.getParameter("name");
   Double km= Double.valueOf(req.getParameter("km"));
  String email= req.getParameter("email");
  String  address=req.getParameter("address");
        TravelEntity entity =new TravelEntity();
//        entity.setId(id);
        entity.setName(name);
        entity.setKm(km);
        entity.setEmail(email);
        entity.setAddress(address);
//        req.setAttribute("id", id);
        req.setAttribute("name", name);
        req.setAttribute("km",km);
        req.setAttribute("email", email);
        req.setAttribute("address", address);
     TravelEntity save=  service.validateAndSaveTravelInfo(entity);

        System.out.println(save);
        req.setAttribute("entity found:", save);
        req.getRequestDispatcher("display.jsp").forward(req, resp);

    }
}
