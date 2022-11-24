package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        retangulo ret = new retangulo();
        System.out.print("Enter the height:");
        ret.height = sc.nextDouble();
        System.out.print("Enter the wight:");
        ret.width = sc.nextDouble();

        System.out.println(ret);

        sc.close();

    }
}
