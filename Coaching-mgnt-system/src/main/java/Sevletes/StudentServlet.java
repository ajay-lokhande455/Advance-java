package Sevletes;

import Controller.StudentController;
import Model.Student;
import com.google.gson.Gson;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

@WebServlet("/Student/student")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dobstring = req.getParameter("dob");
        Date dob = java.sql.Date.valueOf(dobstring);
        Student student = Student.builder()
                .name(req.getParameter("fullName"))
                .email(req.getParameter("email"))
                .phone(req.getParameter("phone"))
                .dob(dob)
                .course(req.getParameter("course"))
                .gender(req.getParameter("gender"))
                .address(req.getParameter("address"))
                .build();

        StudentController studentController = new StudentController();
        studentController.addStudent(student);

        resp.getWriter().println("<script>alert('Student Added successfully');</script>");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("addStudent.html");
        requestDispatcher.include(req, resp);

    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        StringBuilder jsonInput = new StringBuilder();
        try (BufferedReader reader = req.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonInput.append(line);
            }
        }
        System.out.println(jsonInput);

        Gson gson = new Gson();
        Student student = gson.fromJson(jsonInput.toString(), Student.class);

        System.out.println(student);

        StudentController studentController = new StudentController();
        boolean isUpdated = studentController.editStudent(student);

        if (isUpdated) {
            resp.getWriter().println("{\"message\": \"Student updated successfully\"}");
        } else {
            resp.getWriter().println("{\"message\": \"Failed to update student\"}");
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");


        int id = Integer.parseInt(req.getParameter("studentId"));

        StudentController studentController = new StudentController();
        Student student  = studentController.getById(id);

        //Student s = new Student();
        String jsonResponse = new Gson().toJson(student);
        resp.getWriter().write(jsonResponse);

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder jsonInput = new StringBuilder();
        try (BufferedReader reader = req.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonInput.append(line);
            }
        }
        System.out.println(jsonInput);
        System.out.println("-----------------------------------");
        StudentController studentController = new StudentController();

        boolean isDeleted = studentController.deleteStudent(Integer.parseInt(req.getParameter("studentId")));

        PrintWriter out = resp.getWriter();


        if (isDeleted) {
            out.println("{\"message\": \"Student deleted successfully\"}");
        } else {
            out.println("{\"message\": \"Failed to delete student\"}");
        }
}
}

