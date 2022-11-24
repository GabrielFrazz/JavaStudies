package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> lEmployees = new ArrayList<>();

        System.out.print("quantos empregados vao ser registrados: ");
        int N = sc.nextInt();

        int i;

        for (i = 1; i <= N; i++) {
            System.out.println();
            System.out.println("Empregado #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            lEmployees.add(new Employee(id, name, salary) );
        }

        System.out.println();
        System.out.print("digite o funcionario que tera aumento no salário: ");
        int idEmp = sc.nextInt();

        Integer pos = position(lEmployees, idEmp);
        
        if(pos == null){
            System.out.println("Este id nao existe! ");
        }
        else{
            System.out.print("Aumentar em quantos porcentos: ");
            Double percentage = sc.nextDouble();
            lEmployees.get(pos).increaseSalay(percentage);
        }
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (Employee x : lEmployees) {
            System.out.println(x);
        }

        sc.close();
        
    }

    public static Integer position(List <Employee> lEmployees, int id){
         for(int i=0;i<lEmployees.size();i++){
            if(lEmployees.get(i).getId() == id){
                return i;
            }
            
         }
         return null;
    }
}
