package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Util.Dolar;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Preco do dolar: ");
        double dolPrice = sc.nextDouble();
        System.out.print("quantos dolares serao comprados: ");
        double amount = sc.nextDouble();
        System.out.print("quantidade a ser recebida em reais: " + Dolar.CurrencyConverter( amount,dolPrice));

        sc.close();
    }
}
