package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrew on 12.05.2017.
 */
@WebServlet(urlPatterns = {"/Calculator"})
public class IndexController extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));
        int result = number1 + number2;

        Data data = new Data();
        data.number1 = 23;
        data.number2 = 42;

        request.setAttribute("result",result);
        request.setAttribute("data",data);

        request.getRequestDispatcher("index.jsp").forward(request,response);

/*        PrintWriter out = response.getWriter();
        out.println(result);*/
    }
}
