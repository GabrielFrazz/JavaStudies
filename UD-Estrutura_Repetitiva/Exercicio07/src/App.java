import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int N;
        System.out.print("-->");
        N = sc.nextInt();
        
        Double x,y;

        int i;

        for(i=0;i<N;i++){ 
            System.out.print("\n-->");
            x = sc.nextDouble();
            System.out.print("\n-->");
            y = sc.nextDouble();
            if(y==0){
                System.out.println("divisao impossivel");
            }
            else{
                System.out.printf("%.1f",x/y);
            }
        }
        sc.close();
    }
}
