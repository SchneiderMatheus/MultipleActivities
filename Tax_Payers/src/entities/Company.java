package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    
    @Override
    public Double tax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tax'");
    }


    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }


    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
}
