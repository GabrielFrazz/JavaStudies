import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N;

        System.out.println("n de leituras:?");
        N = sc.nextInt();

        int i, num, in=0, out=0;

        for(i=0;i<N;i++){
            System.out.print("\n-->");
            num = sc.nextInt();
            if(num >= 10 && num <= 20){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.println(in + " in\n" + out + " out");
        sc.close();
    }
}
