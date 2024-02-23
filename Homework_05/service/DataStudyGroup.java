package service;

import model.Student;
import model.Teacher;

import java.util.List;

public class DataStudyGroup implements StudyGroupService{
    private Teacher teacher;
    private List<Student> studentList;

    public DataStudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }


}
