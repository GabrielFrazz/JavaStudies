package apication;

import java.util.Scanner;

import entities.triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        triangulo t = new triangulo();
        System.out.print("digite a base:");
        double base = sc.nextDouble();

        t.setbase(base);

        System.out.println(t.getbase());
        sc.close();
    }
}
