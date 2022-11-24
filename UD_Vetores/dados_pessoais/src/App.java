import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas pessoas serao digitadas: ");
        int tam = sc.nextInt();

        char[] gender = new char[tam];
        double[] height = new double[tam];

        double mediaM = 0.0, bigger = 0.0, smaller = 0.0;
        int qtdF = 0, qtdM = 0;

        int i;

        for (i = 0; i < tam; i++) {
            System.out.printf("%da pessoa: \n", i + 1);
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
            System.out.print("Genero: ");
            gender[i] = sc.next().charAt(0);
            if (i == 0) {
                bigger = height[i];
                smaller = height[i];
            }
            if (bigger < height[i]) {
                bigger = height[i];
            }
            if (smaller > height[i]) {
                smaller = height[i];
            }
            if (gender[i] == 'F') {
                qtdF++;
                mediaM += height[i];
            }
            if (gender[i] == 'M') {
                qtdM++;
            }
        }

        mediaM = mediaM / qtdF;

        System.out.println("Menor altura = " + smaller);
        System.out.println("Maior altura = " + bigger);
        System.out.println("Numero de homens = " + qtdM);
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaM));

        sc.close();
    }
}
