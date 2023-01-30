package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numContrato = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int numParcelas = sc.nextInt();

        Contract contract = new Contract(numContrato, date, valor, numParcelas);
        PaypalService paypalService = new PaypalService();
        ContractService service = new ContractService(paypalService);
        service.processContract(contract, numParcelas);

        System.out.println();
        System.out.println("Parcelas: ");

        for(int i = 0; i < numParcelas; i++){
            System.out.println(contract.getInstallment(i).getDueDate() + " - " + String.format("%.2f" , contract.getInstallment(i).getAmount()));
        }

        sc.close();
    }
}
