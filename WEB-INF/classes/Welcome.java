import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Welcome extends HttpServlet {
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("Merhaba " + request.getParameter("name"));
    }
}