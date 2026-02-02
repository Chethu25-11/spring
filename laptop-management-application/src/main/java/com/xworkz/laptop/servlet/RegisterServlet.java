package com.xworkz.laptop.servlet;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/mobile")
public class RegisterServlet extends HttpServlet {
    LaptopService service=new LaptopServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String name= req.getParameter("name");
       String brand= req.getParameter("brand");

        LaptopEntity entity=new LaptopEntity();
        entity.setId(entity.getId());
        entity.setName(name);
        entity.setBrand(brand);
       LaptopEntity entity1= service.validateAndSaveLaptopInfo(entity);
       req.setAttribute("name", name);
       req.setAttribute("brand", brand);
req.getRequestDispatcher("display.jsp").forward(req, resp);

    }
}
