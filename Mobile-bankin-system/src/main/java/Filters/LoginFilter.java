package Filters;

import Controller.LoginController;
import Model.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;


@WebFilter(filterName = "LoginFilter", urlPatterns = {"/login"})
public class LoginFilter implements Filter {

    private LoginController loginController;


    @Override
    public void init(FilterConfig filterConfig) {
        // Initialize DAO or other necessary resources
        loginController = new LoginController();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        // Retrieve username and password from the request
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        User user = User.builder()
                .Username(username)
                .Password(password)
                .build();



        loginController.bankLogin(user);



        if ("admin".equals(username) && "admin".equals(password)) {
            // Allow access to the requested resource
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            // Invalid credentials, redirect to login page with error
            servletRequest.setAttribute("error", "Invalid username or password");
            RequestDispatcher rd = servletRequest.getRequestDispatcher("/login.jsp");
            rd.forward(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        // Clean up any resources if necessary
    }
}
