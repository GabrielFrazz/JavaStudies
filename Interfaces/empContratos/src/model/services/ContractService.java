package model.services;

import java.time.LocalDate;


import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    
    private OnlinePaymentService onPaySer;
    
    public ContractService(OnlinePaymentService onPaySer) {
        this.onPaySer = onPaySer;
    }

    public void processContract(Contract contract, Integer months){

        double standart = contract.getContractValue()/months;

        for(int i = 0; i < months; i++){
            double amount = standart + onPaySer.interest(standart, i+1) + onPaySer.paymentFee(standart);
            LocalDate dueDate = contract.getDate().plusMonths(i+1);
            Installment installment = new Installment(dueDate, amount);
            contract.setInstallment(installment, i);
        }
    }
}