import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Planta plantas[] = new Planta[50];
        int i;
        Scanner scan= new Scanner(System.in);
        //Cadastro das plantas
        try{
        for (i=0;i<50;i++)
        {
            plantas [i] = new Planta ( );
            System.out.println("Insira o nome da planta "+i);
            plantas[i].nome = scan.nextLine();
            System.out.println("Insira o estoque ideal da planta "+i);
            plantas[i].ideal = scan.nextInt();
            System.out.println("Insira o estoque real da planta "+i);
            plantas[i].estoque = scan.nextInt();
            scan.nextLine();
            
        }
        
        //Impressão
        for (i=0;i<50;i++)
        {
            System.out.println("Para a planta "+i);
            estoqueIdeal(plantas[i].estoque, plantas[i].ideal);
        }
    }finally{
        scan.close();
    }
        
        
        
    }
    public static void estoqueIdeal (int real,int desejavel)
    {
        if(real>=desejavel)
        {
            System.out.println("O estoque está ideal.");
        }else{
            int restoque;
            restoque=desejavel-real;
            System.out.println("É necessário comprar mais" +restoque);
        }
    }
}
