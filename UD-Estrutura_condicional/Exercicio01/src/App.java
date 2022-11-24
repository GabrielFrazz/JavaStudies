import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x;
        System.out.println("digite um numero:");
        x = sc.nextInt();
        if(x<0){
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("POSITIVO");
        }

        sc.close();

    }
}
