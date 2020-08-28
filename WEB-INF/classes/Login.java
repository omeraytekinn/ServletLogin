import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Login extends HttpServlet {
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String password = request.getParameter("password");
        if(password.equals("123456")) {
            out.println("Bu yazı sonuçta görünmeyecek");
            RequestDispatcher rd = request.getRequestDispatcher("logged");
            rd.forward(request, response);
        } else {
            out.print("Yanlış Şifre Girdiniz!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.include(request, response);
        }
    }
}