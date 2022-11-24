import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("digite a coordenada x:");
        x = sc.nextInt();
        System.out.print("digite a coordenada y:");
        y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            System.out.print("digite a coordenada x:");
            x = sc.nextInt();
            System.out.print("digite a coordenada y:");
            y = sc.nextInt();

        }

        sc.close();

    }

}
