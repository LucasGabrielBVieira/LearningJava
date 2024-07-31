package model.service;

public class PaypalService implements OnlinePaymentService {


    //Realiza o calculo de porcentagem de juros equivalente ao mês
    //Quantia * (Pocerntagem * Mês) : Juros do mês
    public Double interest(Double amount, Integer month) {
        return amount * (0.01 * month);
    }

    //Quantia * Porcentagem : Juros de pagamento
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }
}
