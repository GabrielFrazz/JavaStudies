package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto P;
        P = new Produto();

        System.out.println("digite os dados do produto");
        System.out.print("\nnome:");
        P.name = sc.nextLine();
        System.out.print("\npreco:");
        P.price = sc.nextDouble();
        System.out.print("\nqtd:");
        P.quantity = sc.nextInt();

        System.out.println(P);

        int add, out;

        System.out.print("digite o numero de entradas:");
        add = sc.nextInt();

        P.addProducts(add);

        System.out.println(P);

        System.out.print("digite o numero de saidas:");
        out = sc.nextInt();
 
        P.removeProducts(out);
        System.out.println(P);

        sc.close();

    }
}
