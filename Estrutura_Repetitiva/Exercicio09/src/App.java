import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("-->");
        N = sc.nextInt();

        int i;

        for(i=1;i<=N;i++){
            if(N%i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
