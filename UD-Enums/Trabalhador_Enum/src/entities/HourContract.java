package entities;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}

    public HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    
    /**
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return Double return the veluePerHour
     */
    public Double getVeluePerHour() {
        return valuePerHour;
    }

    /**
     * @param veluePerHour the veluePerHour to set
     */
    public void setVeluePerHour(Double veluePerHour) {
        this.valuePerHour = veluePerHour;
    }

    /**
     * @return Integer return the hours
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return hours * valuePerHour;
    }

}