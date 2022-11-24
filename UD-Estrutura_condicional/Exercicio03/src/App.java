import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.println("digite o primeiro valor");
        A = sc.nextInt();
        System.out.println("digite o segundo valor");
        B = sc.nextInt();
        if (A > B) {
            if (A % B == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            }
        }
        else{
            if (B % A == 0) {
                System.out.println("SAO MULTIPLOS");
            } else {
                System.out.println("NAO SAO MULTIPLOS");
            } 
        }
        sc.close();
    }
}
