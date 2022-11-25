import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("digite o primeiro valor:");
        x = sc.nextInt();
        System.out.print("digite o segundo valor:");
        y = sc.nextInt();
        int soma = x + y;
        System.out.print("SOMA = " + soma);
        sc.close();
    
    }
}
