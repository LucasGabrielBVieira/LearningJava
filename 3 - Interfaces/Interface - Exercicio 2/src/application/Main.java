package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Main {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Pedido dos dados do usuário
        System.out.println("Entre com os dados: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double valueInstallment = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int month = sc.nextInt();

        Contract contract = new Contract(number, date, valueInstallment);

        ContractService service = new ContractService(new PaypalService());
        service.processService(contract, month);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getListInstallments()) {
            System.out.println(installment.getDueDate().format(fmt) +
             " - " + "R$" +
              String.format("%.2f", installment.getAmount()));
        }

        sc.close();
    }
}
