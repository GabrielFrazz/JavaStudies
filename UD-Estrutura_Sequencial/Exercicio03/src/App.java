import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A,B,C,D;
        System.out.println("digite o valor de A");
        A = sc.nextInt();
        System.out.println("digite o valor de B");
        B = sc.nextInt();
        System.out.println("digite o valor de C");
        C = sc.nextInt();
        System.out.println("digite o valor de D");
        D = sc.nextInt();

        int diferenca = (A*B)-(C*D);
        System.out.println("DIFERENCA = "+diferenca);
        sc.close();
    }
}
