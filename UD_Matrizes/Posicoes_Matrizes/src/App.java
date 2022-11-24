import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira da matriz: ");
        System.out.print("n de linhas: ");
        int l = sc.nextInt();
        System.out.print("\nn de colunas: ");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        int colLenght=0;

        System.out.println();
        System.out.println("digite os elementos da matriz: ");
        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            System.out.print("Linha " + (i + 1) + ":");
            for (int j = 0; j < mat[i].length; j++) {
                if(j==0){
                    colLenght = mat[i].length;
                }
                System.out.print("\n-->");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("A matriz digitada foi:");
        for (int i = 0; i < mat.length; i++) {
            
            for (int j = 0 ; j < mat[i].length; j++) {
               
                System.out.print(" " + mat[i][j] + " ");
                
            }
            System.out.println();
        }


        System.out.println();
        System.out.print("digite um numero: ");
        int num = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    l = i;
                    c = j;
                    System.out.printf("posicao %d,%d:\n", l, c);
                    printResult(l, c, mat, colLenght);
                }
            }
        }

        sc.close();
    }

    public static void printResult(int l, int c, int[][] mat, int colLenght) {
        if((l-1) != -1){
        System.out.println(" " + mat[l - 1][c]);
        }
        if((c-1) != -1 && (c+1)<colLenght){
            System.out.println(mat[l][c - 1] + " " + mat[l][c] + " " + mat[l][c + 1]);
        }
        else if(c != 0){
            System.out.println(mat[l][c - 1] + " " + mat[l][c]);
        }
        else if(c == 0 && (c+1)<colLenght){
            System.out.println(" " + mat[l][c] + " " + mat[l][c + 1]);
        }
        else{
            System.out.println(" " + mat[l][c]);
        }
        if((l+1)<mat.length)
        System.out.println(" " + mat[l + 1][c]);
    }
}
