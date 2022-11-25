package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno al = new Aluno();

        System.out.print("NOME: ");
        al.name = sc.nextLine();
        System.out.print("NOTA 1: ");
        al.notas[0] = sc.nextDouble();
        System.out.print("NOTA 2: ");
        al.notas[1] = sc.nextDouble();
        System.out.print("NOTA 3: ");
        al.notas[2] = sc.nextDouble();

        if (al.NotaFinal() > 60) {
            System.out.printf("NOTA FINAL: %.2f\nPASS", al.NotaFinal());
        } else {
            System.out.printf("NOTA FINAL: %.2f\nFAILED\nMISSING %.2f POINTS", al.NotaFinal(), al.Falta());
        }
        sc.close();
    }
}
