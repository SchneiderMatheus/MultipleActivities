package entities;

public class Student extends Person {
    private String studentId;
    private double[] grades;

    public Student(String name, Integer age, String studentId, double[] grades) {
        super(name, age);
        this.grades = new double[5];
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /*public double[] getGrades() {
        return grades;
    }*/

    public String getGrades() {
        String grades1 = "";
        for (double d : grades) {
            grades1 = " "+d; 
        }
        return grades1;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    
    public String displayInfo(){
        return "Name: "+getName()+" Age:"+getAge();
    }

    public String toString(){
        return "Name: "+getName()+", Age:"+getAge()+", Grades: "+getGrades()+ ", ID: "+getStudentId();
    }
}
