package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("quantas pessoas serao digitadas: ");
        int tam = sc.nextInt();

        Person[] vect = new Person[tam];

        int i, qtd_minors = 0;
        double media = 0.0;

        for(i=0;i<vect.length;i++){
            System.out.printf("dados da %da pessoa: \n",i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double size = sc.nextDouble();

            vect[i] = new Person(name, age, size);
            media += size;

            if(age < 16){
                qtd_minors++;
            }

        }

        media = media/vect.length;
        double percentage = (qtd_minors * 100.00)/vect.length;

        System.out.println();

        System.out.println("Altura media: " + String.format("%.2f",media));
        System.out.println("Pessoas com menos de 16 anos: " + percentage + "%");

        for(i=0;i<vect.length;i++){
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();

    }
}
