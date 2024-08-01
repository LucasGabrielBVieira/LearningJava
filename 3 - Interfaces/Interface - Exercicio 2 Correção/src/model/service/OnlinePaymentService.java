package model.service;

public interface OnlinePaymentService {

    //Interface que cria um contrato com os diferentes serviços de pagamento
    public Double paymentFee(Double amount);
    public Double interest(Double amount, Integer month);
}
