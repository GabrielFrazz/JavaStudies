package model.services;

public class PaypalService implements OnlinePaymentService{
    
    public Double paymentFee(Double amount){
        return amount * 0.02;
    }

    public Double interest(Double amount, Integer month){
        return amount * (month * 0.01);
    }
}