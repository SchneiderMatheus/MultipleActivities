package entities;

public class Teacher extends Person {
    private String teacherId;
    private String subject;
    private Double salary;
    
    public Teacher(String name, Integer age, String teacherId, String subject, Double salary) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
        this.salary = salary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public void giveRaise(Double raise){
        this.salary = salary * (raise/100);
    }
    public String displayInfo(){
        return "Name: " + getName()+", Age: "+getAge()+", Teacher ID: "+teacherId+", Subject: "+subject+", Salary: "+salary;
    }
}
