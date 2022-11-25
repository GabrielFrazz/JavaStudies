import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        int tam = sc.nextInt();

        int[] vect = new int[tam];

        int i, qtdPares=0;
        double media = 0.0;

        for (i = 0; i < vect.length; i++) {
            System.out.print("\n-->");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                media += vect[i];
                qtdPares++;
            }
            if (media != 0) {
                if (i == vect.length - 1) {
                    media = media / qtdPares;
                    System.out.println("MEDIA DOS PARES = " + String.format("%.2f",media));
                }
            }
            else{
                if (i == vect.length - 1) {
                    System.out.println("NENHUM NUMERO PAR");
                } 
            }
        }

        sc.close();

    }
}
