import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quanto tamanhot tem cada vetor: ");
        int tam = sc.nextInt();

        int[] vet1, vet2, vetSum;
        vet1 = new int[tam];
        vet2 = new int[tam];
        vetSum = new int[tam];

        int i;
        int tr = 0;

        for(i=0;i<vet2.length;i++){

            if(tr == 0){
                if(i==0){
                    System.out.println("Digite os valores do vetor A: ");
                }
                System.out.print("\n-->");
                vet1[i] = sc.nextInt();
                if(i == vet1.length - 1){
                    tr += 1;
                    i=0;
                }
            }

            if(tr == 1){
                if(i==0){
                    System.out.println("Digite os valores do vetor B: ");
                }
                System.out.print("\n-->");
                vet2[i] = sc.nextInt();
                if(i == vet1.length - 1){
                    tr += 1;
                    i=0;
                }
            }

            if(tr == 2){
                vetSum[i] = vet1[i] + vet2[i];
                if(i == vet1.length - 1){
                    tr += 1;
                    i=0;
                }
            }
            
            if(tr == 3){
                if(i==0){
                    System.out.println("VETOR RESULTANTE: ");
                }
                System.out.println(vetSum[i]);
            }
        }

        sc.close();
    }
}
