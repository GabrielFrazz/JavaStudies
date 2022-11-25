import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Double A, B, C;
        System.out.println("\tdigite os valores de A, B e C ");
        System.out.print("A:");
        A = sc.nextDouble();
        System.out.print("\nB:");
        B = sc.nextDouble();
        System.out.print("\nC:");
        C = sc.nextDouble();

        Double Atri, Acir, Atrap, Aquad, Aret;

        Atri = (A*C)/2.0;
        Acir = Math.pow(C,2) * 3.14159;
        Atrap = (A+B)*C/2.0;
        Aquad = B*B;
        Aret = A*B;

        System.out.println("\tas areas sao:");
        System.out.printf("TRIANGULO: %.3f\n",Atri);
        System.out.printf("CIRCULO: %.3f\n",Acir);
        System.out.printf("TRAPESIO: %.3f\n",Atrap);
        System.out.printf("QUADRADO: %.3f\n",Aquad);
        System.out.printf("RETANGULO: %.3f\n",Aret);
        
        sc.close();

    }
}
