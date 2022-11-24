import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        int tam = sc.nextInt();

        int[] vect = new int[tam];

        System.out.println();

        int[] pares;
        int tam_pares = 0, j = 0;
        Boolean x = true;

        for (int i = 0; i < vect.length; i++) {

            if (x == true) {
                System.out.print("\n-->");
                vect[i] = sc.nextInt();

                if (vect[i] % 2 == 0) {
                    tam_pares++;
                }
                if (i == vect.length - 1) {
                    x = false;
                    i = 0;
                }
            }

            if (x == false) {
                pares = new int[tam_pares];
                if (vect[i] % 2 == 0) {
                    if (j == 0) {
                        System.out.println("NUMEROS PARES:");
                    }
                    pares[j] = vect[i];
                    System.out.print(pares[j] + " ");
                    j++;
                }

                if (i == vect.length - 1) {
                    System.out.println();
                    System.out.println("QUANTIDADE DE PARES = " + tam_pares);
                }
            }
        }

        sc.close();
    }
}
