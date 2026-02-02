import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/login")
public class InsuranceServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String email=  req.getParameter("email");
     String  password= req.getParameter("password");
req.setAttribute("email", email);
req.setAttribute("password", password);
        System.out.println("email"+email);
        System.out.println("password"+password);
        RequestDispatcher dispatcher = req.getRequestDispatcher("phone.jsp");
        dispatcher.forward(req, resp);
        resp.getWriter().print("login Successful");
    }
}
