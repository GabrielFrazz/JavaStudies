package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario fun = new funcionario();

        System.out.print("Nome: ");
        fun.nome = sc.nextLine();
        System.out.print("salario: ");
        fun.salario = sc.nextDouble();
        System.out.print("imposto: ");
        fun.imposto = sc.nextDouble();

        System.out.println("empregado: " + fun);

        double percent;

        System.out.print("aumentar o salario em que porcentagem: ");
        percent = sc.nextDouble();

        fun.AumentaSalario(percent);

        System.out.println("Atualizacao: " + fun);

        sc.close();
    }

}
