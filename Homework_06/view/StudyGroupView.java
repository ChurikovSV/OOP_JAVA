package view;

import model.Student;
import model.Teacher;

import java.util.List;

public class StudyGroupView {
    public void printStudyGroup(Teacher teacher, List<Student> listStudent) {
        TeacherView teacherView = new TeacherView();
        teacherView.printTeacher(teacher);
        StudentView studentView = new StudentView();
        studentView.printStudent(listStudent);


    }
}
