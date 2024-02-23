package model;

public class Student extends User {
    private int studentId;
    private double average;

    public Student(String name, int age, double average) {
        super(name, age);
        this.average = average;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
