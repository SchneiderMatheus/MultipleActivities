package entities;

public class Student extends Person {
    private String studentId;
    private double[] grades;

    public Student(String name, Integer age, String studentId, double[] grades) {
        super(name, age);
        this.grades = grades;
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
        for (int i = 0; i < grades.length; i++) {
            grades1 += " "+grades[i]; 
        }
        return grades1;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    
    public String displayInfo(){
        return "Name: "+getName()+" Age:"+getAge()+", Grades: "+getGrades()+ ", ID: "+getStudentId();
    }

    public String toString(){
        return "Name: "+getName()+", Age:"+getAge()+", Grades: "+getGrades()+ ", ID: "+getStudentId();
    }
}
