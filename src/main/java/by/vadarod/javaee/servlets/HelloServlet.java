package by.vadarod.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    private static final String PAGE_HEADER_NAME = "Привет, Сервлет!";
    private static final String MENTI_NAME = "Ilya Krachkovsky";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.printf("<title>%s</title>\n", PAGE_HEADER_NAME);
        out.println("</head>");
        out.println("<body>");
        out.printf("<h1>Hello, %s</h1>\n", MENTI_NAME);
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
