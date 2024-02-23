package service;

import model.Student;
import model.Teacher;

import java.util.List;

public interface StudyGroupService {

    static DataStudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        DataStudyGroup studyGroup = new DataStudyGroup(teacher, studentList);
        return studyGroup;
    }

}
