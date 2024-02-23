package view;

import model.Student;

import java.util.List;

public class StudentView {
    public void printStudent(List<Student> listStudent) {
        System.out.println("Все студенты: " + "\n" + listStudent);
    }
}
