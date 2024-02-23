package controller;

import model.Student;
import model.Teacher;
import model.User;
import service.DataStudent;
import service.DataTeacher;
import view.StudentView;
import view.StudyGroupView;
import view.TeacherView;

import java.util.List;

public class Controller {
    private DataTeacher dataTeacher = new DataTeacher();
    private DataStudent dataStudent = new DataStudent();
    private StudyGroupView studyGroupView = new StudyGroupView();

    public void start() {
        User user1 = new Student("Сергей", 21, 4.5);
        User user2 = new Teacher("Юля", 40, "math");
        User user3 = new Student("Виталич", 20, 5.0);

        createStudent(user1);
        createTeacher(user2);
        createStudent(user3);
        studyGroupView.printStudyGroup(dataTeacher.read(0), dataStudent.read());

    }

    public void createStudent(User user) {
        dataStudent.create(user);
    }

    public void createTeacher(User user) {
        dataTeacher.create(user);
    }

    public Controller() {
        this.dataTeacher = dataTeacher;
        this.dataStudent = dataStudent;
        this.studyGroupView = studyGroupView;
    }
}
