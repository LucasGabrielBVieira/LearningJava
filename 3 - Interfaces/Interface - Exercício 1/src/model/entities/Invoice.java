package model.entities;

public class Invoice {

    //Classe que irá gerar a nota de pagamento contendo a taxa, o pagamento basico e a soma dos dois

    private Double basicPayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    //Função que gera o valor total
    //É utilizado get pra facilitar uma possível mudança na lógica dos atributos
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }

}
