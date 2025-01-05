package Service;

import Dao.StudentDao;
import Model.Student;

public class StudentService {

    StudentDao studentDao = new StudentDao();
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public boolean editStudent(Student student) {
        return studentDao.editStudent(student);
    }

    public Student getById(int id) {
        return studentDao.getById(id);
    }

    public boolean deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }
}
