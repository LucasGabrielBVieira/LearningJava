package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

    //Essa classe representa um serviço com atributos e funções que farão parte da implemetação do objeto da classe Invoice
    //...no objeto da classe CarRental

    //Atributo em Double que representa o preço por dia e o preçoe por hora
    private Double pricePerDay;
    private Double pricePerHour;

    //Composição da classe responsável pelo cálculo do imposto
    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    //Função que será responsável por fazer a composição entre as duas classes
    public void processInvoice(CarRental carRental) {

        //Para fazer o cálculo entre horas, nesse exemplo, é preciso ter um valor fraguimentado
        //...por isso, a conversão between (entre) as datas, será calculada em minutos, e posteriormente dividida em 60.
        double minutes = Duration.between(carRental.getStart(),  carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        //variável que irá servir como parâmetro na chamada da classe Invoice
        double basicPayment;

        if (hours <= 12) {
            //Se os minutes * 60 resultarem em um número menor ou igual a doze, o pagamento básico será a multiplacação
            //...entre o preço por hora e o arredondamento para cima da variável hours
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            //Se não, o resultado será a multiplicação de hours - divido por 24 - e preço por dia
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        //Chamada do serviço que irá calcular o imposto
        double tax = taxService.tax(basicPayment);

        //Por fim, a composição feita entre CarRental e Invoice
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
    
}
