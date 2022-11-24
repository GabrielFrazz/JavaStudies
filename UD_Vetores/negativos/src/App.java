import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o tamanho do vetor: ");
        int tam = sc.nextInt();

        int[] vect = new int[tam];

        int i;

        System.out.println();
        System.out.println("DIGITE OS ELEMENTOS DO VETOR");

        for (i = 0; i < vect.length; i++) {
            System.out.print("\n-->");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS NEGATIVOS: ");

        for (i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n",vect[i]);
            }
        }

        sc.close();
    }
}
