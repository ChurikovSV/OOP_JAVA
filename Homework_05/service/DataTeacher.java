package service;

import model.Student;
import model.Teacher;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacher implements ServiceTeacher{
    List<Teacher> listTeacher = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(listTeacher.size()+1);
        listTeacher.add(teacher);
        return teacher;
    }

    @Override
    public Teacher read(int num) {
        return listTeacher.get(num);
    }

    public DataTeacher() {
    }
}