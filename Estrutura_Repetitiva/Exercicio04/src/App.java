import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        
        System.out.print("digite o final do intervalo: ");
        N = sc.nextInt();

        if(N%2 == 0){
            N = N - 1;
        }

        int i;

        for(i=1;i<=N;i=i+2){
            System.out.println(i);
        }

        sc.close();
    }
}
