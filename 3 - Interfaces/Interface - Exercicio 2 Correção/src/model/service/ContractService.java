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

        //Loop até o fim dos meses
        for (int i = 1; i <= months; i++) {

            //Declaração feita para guardar na memória a data do pagamento da fatura do mês
            LocalDate paymentDate = contract.getDate().plusMonths(i);

            //Calculo do valor + as taxas a serem pagas
            double installment = paymentService.interest(valueTotalInstallment, i);
            double fee = paymentService.paymentFee(valueTotalInstallment + installment);
            double quota = valueTotalInstallment + installment + fee;

            //Usando get em contract para fazer um .add na list que guarda as parcelas
            contract.getInstallments().add(new Installment(paymentDate, quota));
        }
    }

}
