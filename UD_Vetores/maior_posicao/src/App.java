import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        int size = sc.nextInt();

        double[] vet = new double[size];

        int i, maiorPosicao = 0;
        double maior = 0.0;

        System.out.println();
        System.out.println("digite os valores:");

        for (i = 0; i < vet.length; i++) {
            System.out.print("\n-->");
            vet[i] = sc.nextDouble();
            if (i == 0) {
                maior = vet[i];
            }
            if (maior < vet[i]) {
                maior = vet[i];
                maiorPosicao = i;
            }
        }
        System.out.println();
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + maiorPosicao);

        sc.close();
    }
    
}
