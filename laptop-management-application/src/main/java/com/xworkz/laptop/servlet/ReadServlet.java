package com.xworkz.laptop.servlet;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.repository.LaptopRepo;
import com.xworkz.laptop.repository.LaptopRepoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/readData")
public class ReadServlet extends HttpServlet {
    LaptopRepo service=new LaptopRepoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      List<LaptopEntity> entityList= service.findAll();
        System.out.println(entityList);
        req.setAttribute("entityList",entityList);
        req.getRequestDispatcher("Read.jsp").forward(req, resp);
    }
}
