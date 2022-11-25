package Application;

import java.util.Locale;
import java.util.Scanner;

import Bank.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n): ");
        char condition = sc.next().charAt(0);

        Account ac;

        if (condition == 'y') {
            System.out.print("Enter initial deposit value: ");
            double money = sc.nextDouble();
            ac = new Account(number, name, money);

        } else {
            ac = new Account(number, name);
        }

        System.out.println("Account data:");
        System.out.println(ac);

        System.out.print("Enter a deposit value: ");
        ac.deposit(sc.nextDouble());
        System.out.println("Updated account data:\n" + ac);

        System.out.print("Enter a withdraw value: ");
        ac.withdaw(sc.nextDouble());
        System.out.println("Updated account data:\n" + ac);

        sc.close();
    }
}
