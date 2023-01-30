package model.entities;

import java.time.LocalDate;

public class Contract {
    
    private Integer number;
    private LocalDate date;
    private Double contractValue;

    private Installment[] installment;

    public Contract(){}

    public Contract(Integer number, LocalDate date, Double contractValue, int tam) {
        this.number = number;
        this.date = date;
        this.contractValue = contractValue;
        installment = new Installment[tam];
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public Installment[] getInstallment() {
        return installment;
    }

    public Installment getInstallment(int pos) {
        return installment[pos];
    }

    public void setInstallment(Installment installment, int pos) {
        this.installment[pos] = installment;
    }

}