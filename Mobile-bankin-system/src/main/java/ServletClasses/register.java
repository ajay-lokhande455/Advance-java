package ServletClasses;

import Controller.RegistrationController;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/register")
public class register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = User.builder()
                .Username(username)
                .Password(password)
                .fullName(fullname)
                .Email(email)
                .build();
        RegistrationController controller = new RegistrationController();
        controller.registration(user);

        filterChain.doFilter(servletRequest, servletResponse);
        servletRequest.setAttribute("success", "Registration Successful");
        response.setContentType("text/html");

    }
}
