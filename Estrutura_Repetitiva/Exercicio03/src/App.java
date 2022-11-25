import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int fim=0;
        int Alc=0, Gas=0, Dies=0, cont;
        System.out.println("digite os códigos:");
        while(fim != 4){
            System.out.print("\n-->");
            cont = sc.nextInt();

            if(cont == 1){
                Alc++;
            }
            else if(cont == 2){
                Gas++;
            }
            else if(cont == 3){
                Dies++;
            }
            else if(cont == 4){
                fim = 4;
            }
            else{
                System.out.println("codigo invalido");
            }

        }

        System.out.println("MUITO OBRIGADO\nAlcool: " + Alc + "\nGasolina: "  + Gas + "\nDiesel: " + Dies);
        sc.close();
    }
}
