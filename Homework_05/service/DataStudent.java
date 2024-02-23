package service;

import model.Student;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudent implements ServiceStudent{
    List<Student> listStudent = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(listStudent.size()+1);
        listStudent.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return listStudent;
    }


}
