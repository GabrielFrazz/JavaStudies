import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N;

        System.out.print("digite o numero: ");
        N = sc.nextInt();

        int i, x=N;

        for(i=(N-1);i>=1;i--){
            x = x * i;
        }

        System.out.println(x);

        sc.close();
    }
}
