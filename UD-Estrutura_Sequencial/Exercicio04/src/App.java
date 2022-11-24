import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("digite o numero do funcionario");
        num = sc.nextInt();
        int Nhora;
        System.out.println("horas trabalhadas");
        Nhora = sc.nextInt();
        Double Shora;
        System.out.println("salario por hora:");
        Shora = sc.nextDouble();

        Double Salario = Nhora * Shora;
        System.out.println("NUMERO = " + num);
        System.out.println("SALARIO = " + Salario);

        sc.close();

    }
}
