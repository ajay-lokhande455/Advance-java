package Controller;

import Model.Student;
import Service.StudentService;

public class StudentController {

    StudentService studentService = new StudentService();
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }


    public boolean editStudent(Student student) {
       return studentService.editStudent(student);
    }

    public Student getById(int id) {
        return studentService.getById(id);

    }

    public boolean deleteStudent(int id) {
        return studentService.deleteStudent(id);
    }
}
