package entities;

public class Student extends Person {
    private String studentId;
    private double[] grades;

    public Student(String name, Integer age) {
        super(name, age);
        this.grades = new double[5];
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    
}
