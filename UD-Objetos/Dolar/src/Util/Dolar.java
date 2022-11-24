package Util;

public class Dolar {

    public static double iof = (6/(double)100);

    public static double CurrencyConverter(double amount, double dolPrice){
        double tax = amount * iof;
        return (tax + amount) * dolPrice;
    }
}
