import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int h1, h2;
        System.out.println("digite a hora de inicio");
        h1 = sc.nextInt();
        System.out.println("digite a hora de termino");
        h2 = sc.nextInt();
        if(h1<h2){
        System.out.printf("O JOGO DUROU: %d HORA(s)" , (h2-h1));
        }
        else{
            System.out.printf("O JOGO DUROU: %d HORA(s)" , (24 - h1 - h2));
        }
        sc.close();
    }
}
