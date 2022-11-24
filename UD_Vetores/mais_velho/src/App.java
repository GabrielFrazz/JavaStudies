import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        int tam = sc.nextInt();

        String[] veStrings = new String[tam];
        int[] age = new int[tam];

        int i;
        int maior = 0, pos = 0;
        
        for(i=0;i<tam;i++){
            System.out.printf("%da pessoa: \n", i+1);
            System.out.print("nome: ");
            sc.nextLine();
            veStrings[i] = sc.nextLine();
            System.out.print("idade: ");
            age[i] = sc.nextInt();
            if(i==0){
            maior = age[i];
            }
            if(maior<age[i]){
                maior = age[i];
                pos = i;
            }
            if(i == tam - 1){
                System.out.println("PESSOA MAIS VELHA: " + veStrings[pos]);
            }
        }
        sc.close();
    }
}
