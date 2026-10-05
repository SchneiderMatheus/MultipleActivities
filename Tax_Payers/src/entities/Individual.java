package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;
    private Integer numberOfEmployees;

    public Individual(String name, Double anualIncome, Double healthExpenditures, int numberOfEmployees) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tax'");
    }
    
}
