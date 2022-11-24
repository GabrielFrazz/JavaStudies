import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("-->");
        N = sc.nextInt();

        int i, quad;
        float cub;
        
        for(i=1;i<=N;i++){
            quad = i * i;
            cub = i * i * i;
            System.out.printf("%d - %d - %.0f\n",i,quad,cub);

        }

        sc.close();
    }
}
