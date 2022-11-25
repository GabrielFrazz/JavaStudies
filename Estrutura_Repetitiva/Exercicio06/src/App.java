import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("-->");
        N = sc.nextInt();
    
        Double x, media;

        int i, j;
        
        for(i=0;i<N;i++){
            media =0.0;
            for(j=0;j<3;j++){
                System.out.println("-->");
                x = sc.nextDouble();

                if(j==0){
                    media = media + (2*x);
                }
                else if(j==1){
                    media = media + (3*x);
                }
                else{
                    media = media + (5*x);
                }
            }

            media = media/10.0;
            System.out.printf("%.1f",media);
            
        }

        sc.close();
    }
}
