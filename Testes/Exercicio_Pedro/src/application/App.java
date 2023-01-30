package application;

import java.util.Scanner;

import entities.Salario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, bem vinda(o).");

        Salario[] manicures = new Salario[2];

        for (int i = 0; i < 2; i++){
            String x;
            int n1,n2;
            float y1, y2;
            manicures[i] = new Salario();
            System.out.println("Digite seu nome:");
            x = input.next();
            manicures[i].setNome(x);
            System.out.println("Digite a quantidade de mãos feitas:");
            n1 = input.nextInt();
            manicures[i].setQtdM(n1);
            System.out.println("Valor individual:");
            y1 = input.nextFloat();
            manicures[i].setVM(y1);
            System.out.println("Digite a quantidade de pés feitos:");
            n2 = input.nextInt();
            manicures[i].setQtdP(n2);
            System.out.println("Valor individual:");
            y2 = input.nextFloat();
            manicures[i].setVP(y2);
        }

        for(int i = 0; i < 2; i++){
            System.out.println(manicures[i].toString());
        }
        

        input.close();
    }
}
