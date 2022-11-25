import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("tamanho do vetor: ");
        int tam = sc.nextInt();

        double[] vect = new double[tam];

        double media = 0.0;
        boolean x = true;

        for(int i = 0; i<vect.length;i++){
            if(x == true){
                System.out.print("\n-->");
                vect[i] = sc.nextDouble();
                media += vect[i];
                if(i == vect.length - 1){
                    media = media/vect.length;
                    System.out.println();
                    System.out.println("MEDIA DO VETOR = " + media);
                    x = false;
                    i = 0;
                }
            }

            if(x == false){
                if(i == 0){
                    System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
                }
                if(vect[i]<media){
                    System.out.println(vect[i]);
                }
            }

        }

        sc.close();
    }
}
