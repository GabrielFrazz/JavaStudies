import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int CodP1, CodP2;
        System.out.println("digite o codigo da primeira peca");
        CodP1 = sc.nextInt();
        System.out.println("digite o codigo da segunda peca");
        CodP2 = sc.nextInt();

        int NumP1, NumP2;
        System.out.println("digite a quantidade da primeira peca");
        NumP1 = sc.nextInt();
        System.out.println("digite a quantidade da segunda peca");
        NumP2 = sc.nextInt();

        Double PreP1, PreP2;
        System.out.println("digite o preco da primeira peca");
        PreP1 = sc.nextDouble();
        System.out.println("digite o preco da segunda peca");
        PreP2 = sc.nextDouble();

        Double PrecoFinal = (NumP1 * PreP1) + (NumP2 * PreP2);
        System.out.printf("codigo das pecas compradas -%d -- %d- \n",CodP1,CodP2);
        System.out.println("VALOR A PAGAR = " + PrecoFinal);

        sc.close();

    }
}
