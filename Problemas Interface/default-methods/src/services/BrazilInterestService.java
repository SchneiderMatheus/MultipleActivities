package services;

public class BrazilInterestService implements InterestService {
    private Double interest;

    public BrazilInterestService(double interest){
        this.interest = interest;
    }
    @Override 
    public double getInterest() {
		return interest;
	}

}
