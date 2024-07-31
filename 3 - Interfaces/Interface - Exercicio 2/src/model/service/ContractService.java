package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processService(Contract contract, Integer months) {
        
        //Calculo do valor de cada parcela
        double valueTotalInstallment = contract.getTotalValue() / months;
        //Pegando a data inicial do contrato
        LocalDate firstDate = contract.getDate();

        //Loop até o fim dos meses
        for (int i = 1; i <= months; i++) {

            //Declaração feita para guardar na memória a data do pagamento da fatura do mês
            LocalDate paymentDate = firstDate.plusMonths(i);

            //Calculo do valor + as taxas a serem pagas
            double valueInstallment;
            valueInstallment = valueTotalInstallment + paymentService.interest(valueTotalInstallment, i);
            valueInstallment += paymentService.paymentFee(valueInstallment);

            //Usando get em contract para fazer um .add na list que guarda as parcelas
            contract.getListInstallments().add(new Installment(paymentDate, valueInstallment));
        }
    }

}
