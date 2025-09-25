package by.vadarod.javaee.servlets;

import jakarta.servlet.*;

import java.io.IOException;

public class HelloFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Привет, сервлет!");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
