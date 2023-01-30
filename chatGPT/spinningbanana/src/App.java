import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    for (int i = 0; i < 360; i++) {
        System.out.println("  ________  ");
        System.out.println(" /        \\ ");
        System.out.println("/          \\");
        System.out.println("\\          /");
        System.out.println(" \\________/ ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        System.out.println("   |    |   ");
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("\033[3D");
      }
  }
}