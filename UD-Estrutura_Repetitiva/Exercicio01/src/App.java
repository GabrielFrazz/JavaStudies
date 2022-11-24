import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int senha=0;
        while(senha!=2002){
            System.out.print("digite sua senha: ");
            senha = sc.nextInt();
            if(senha == 2002){
                System.out.println("\n\tAssesso permitido");
            }
            else{
                System.out.println("\n\tSenha invalida");
            }
        }

        sc.close();
    }
}
