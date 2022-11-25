import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("digite o tamanho: ");
        int tam = sc.nextInt();

        double[] vet = new double[tam];

        double sum = 0.0;
        int i;

        for(i=0;i<vet.length;i++){
            System.out.print("\n-->");
            vet[i] = sc.nextDouble();
            sum += vet[i];
        }

        double media = sum/vet.length;

        System.out.println();

        System.out.print("VALORES: ");

        for(i=0;i<vet.length;i++){
            System.out.print(vet[i] + " ");
            if(i == vet.length - 1){
                System.out.println("\nSOMA = " + sum);
                System.out.println("MEDIA = " + media);
            }
        }

        sc.close();
    }
}
