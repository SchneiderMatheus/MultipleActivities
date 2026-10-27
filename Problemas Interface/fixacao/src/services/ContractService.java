package services;

import java.time.LocalDateTime;

import entities.Contract;
import entities.Installment;

public class ContractService {
    private PaymentService paymentService;
    
    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract,Integer months){
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDateTime dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(basicQuota, i);
            double fee = paymentService.paymentTax(interest);
            double quota = basicQuota + interest +fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
