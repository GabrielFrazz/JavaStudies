import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double Cq=4.0, X_l=4.5, X_b=5.0, T_s=2.0, Ref=1.5, preco;
        int cod, qtd;
        System.out.print("digite o codigo do produto: ");
        cod = sc.nextInt();
        System.out.print("digite a quantidade de itens: ");
        qtd = sc.nextInt();

        if(cod == 1){
            preco = qtd * Cq;

        }
        else if(cod == 2){
            preco = qtd * X_l;

        }
        else if(cod == 3){
            preco = qtd * X_b;

        }
        else if(cod == 4){
            preco = qtd * T_s;

        }
        else{
            preco = qtd * Ref;    

        }

        System.out.printf("\nTotal: R$%.2f",preco);
        
        sc.close();

    }
}
