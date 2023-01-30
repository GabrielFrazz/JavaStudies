package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Inquilino;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Inquilino[] vectInquilinos = new Inquilino[10];

        System.out.print("Quantos quartos vao ser alugados: ");
        int N = sc.nextInt();

        int i;

        try{
        for (i = 0; i < N; i++) {
            System.out.println();
            System.out.printf("Aluguel #%d:\n",i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int room = sc.nextInt();

            vectInquilinos[room] = new Inquilino(name, email);
        }

        System.out.println();

        System.out.println("quartos ocupados: ");

        for (i=0 ; i < vectInquilinos.length; i++) {
            if(vectInquilinos[i]!= null){
            System.out.println(i + ": " + vectInquilinos[i].toString());
            }
            
        }
    }finally{
        sc.close();
    }
        

    }
    
}
