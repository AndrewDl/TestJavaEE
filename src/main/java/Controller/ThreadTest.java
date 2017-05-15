package Controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Andrew on 15.05.2017.
 */
@WebServlet(urlPatterns = {"/counter"})
public class ThreadTest extends HttpServlet{

    @Override
    public void init(){
        Main.main(null);
    }

    @Override
    public void service (HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        out.println(Main.counter);
    }



}
