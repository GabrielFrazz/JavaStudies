import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double Raio;
        System.out.print("digite o valor da area do circulo: ");
        Raio = sc.nextDouble();

        Double Area = 3.14159 * (Math.pow(Raio, 2));

        System.out.printf("Area = %.4f", Area);
        sc.close();

    }
}
