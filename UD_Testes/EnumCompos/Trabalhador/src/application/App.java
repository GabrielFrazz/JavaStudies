package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        
        System.out.print("Digite o departamento: ");
        String departmentName = sc.nextLine();
        System.out.println("Digite os dados do empregado:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Nivel: ");
        String level = sc.nextLine();
        System.out.print("Salario base: ");
        double baseSalary = sc.nextDouble();

        System.out.print("quantos contratos: ");
        int N = sc.nextInt();

        Worker wr = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        for(int i=1;i<=N;i++){
            System.out.println("digite as informacoes do #" + i + " contrato:");
            System.out.print("data (DD/MM/YYYY):");
            sc.nextLine();
            String date = sc.nextLine();
            LocalDate d01 = LocalDate.parse(date,fmt1);
            System.out.print("valor por hora: ");
            double valuePH = sc.nextDouble();
            System.out.print("duracao (em horas): ");
            int duration = sc.nextInt();

            HourContract horcon = new HourContract(d01, valuePH, duration);
            wr.addContract(horcon);
        }

        System.out.println();
        System.out.print("digite o mes e ano para calcular o salario (MM/YYYY): ");
        sc.nextLine();
        String date = sc.nextLine();
        LocalDate d02 = LocalDate.parse(date,fmt2);
        int year = d02.getYear();
        int month = d02.getMonthValue(); 

        System.out.println("nome: " + wr.getName());
        System.out.println("departamento: " + wr.getDepartment().getName());
        System.out.println("salario para " + date + ": " + wr.income(year, month));

        sc.close();

    }
}
