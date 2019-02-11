
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL PC
 */
public class OwnNewClass extends HttpServlet{
    public void doGet(HttpServletRequest aareha, HttpServletResponse jareha)
            throws IOException, ServletException
    {
        jareha.setContentType("text/html;charset=UTF-8");
        
        PrintWriter print = jareha.getWriter();
        print.println(aareha.getParameter("name"));
    }
}
