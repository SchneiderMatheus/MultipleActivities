package services;

import entities.Contract;

public class ContractService {
    private PaymentService paymentService;
    
    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract,Integer months){

    }
}
