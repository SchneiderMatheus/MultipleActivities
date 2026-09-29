package entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge = 1.1;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    @Override 
    public double payment(){
        return (getHours() * getHours())*additionalCharge;
    }
    

}
