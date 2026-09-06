package entities;

public class Student extends Person {
    private String studentId;
    private double[] grades;

    public Student(String name, Integer age) {
        super(name, age);
        this.grades = new double[5];
    }
    
}
