package com.xworkz.laptop.servlet;

import com.xworkz.laptop.repository.LaptopRepo;
import com.xworkz.laptop.repository.LaptopRepoImpl;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/deleteData")
public class DeleteServlet extends HttpServlet {
LaptopRepo service=new LaptopRepoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      Boolean delete=  service.deleteById(Integer.parseInt(req.getParameter("id")));
        System.out.println(delete);
        req.setAttribute("delete", delete);
       resp.sendRedirect(req.getContextPath()+"/readData");
    }
}
