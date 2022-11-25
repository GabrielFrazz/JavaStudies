import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double x, y;
        System.out.print("digite a coordenada x:");
        x = sc.nextDouble();
        System.out.print("digite a coordenada y:");
        y = sc.nextDouble();

        if(x>0 && y>0){
            System.out.println("Q1");
        }
        else if(x>0 && y<0){
            System.out.println("Q4");
        }
        else if(x<0 && y>0){
            System.out.println("Q2");
        }
        else if(x<0 && y<0){
            System.out.println("Q3");
        }
        else if(x == 0 && y != 0){
            System.out.println("Eixo X");
        }
        else if(x != 0 && y == 0){
            System.out.println("Eixo Y");
        }
        else if(x == 0 && y == 0){
            System.out.println("Origem");
        }

        sc.close();
    }
}
