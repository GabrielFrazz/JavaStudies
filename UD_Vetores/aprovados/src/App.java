import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos alunos serao digitados: ");
        int tam = sc.nextInt();

        String[] names = new String[tam];
        double[] n1, n2, media;
        n1 = new double[tam];
        n2 = new double[tam];
        media = new double[tam];

        int i;
        boolean x = true;

        for (i = 0; i < tam; i++) {
            if (x == true) {
                System.out.println("digite as informações: ");
                System.out.print("nome: ");
                sc.nextLine();
                names[i] = sc.nextLine();
                System.out.print("nota 1: ");
                n1[i] = sc.nextDouble();
                System.out.print("nota 2: ");
                n2[i] = sc.nextDouble();
                media[i] = (n1[i] + n2[i])/2.0;
                if(i == tam - 1){
                    x = false;
                    i=0;
                }
            }
            if(x == false){
                if(i==0){
                    System.out.println("alunos aprovados:");
                }
                if(media[i]>=6.0){
                    System.out.println(names[i]);
                }
            }

        }

        sc.close();

    }
}
