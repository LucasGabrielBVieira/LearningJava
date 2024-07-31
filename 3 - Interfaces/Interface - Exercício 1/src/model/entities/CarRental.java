package model.entities;

import java.time.LocalDateTime;

public class CarRental {

    //Essa classe será responsável por instânciar o objeto que representa em que regras o carro será alugado

    //recebendo duas instâncias da classe LocalDateTime para representar o início e o fim do aluguel
    private LocalDateTime start;
    private LocalDateTime finish;

    //Composição das classes vehicle e invoice
    private Vehicle vehicle;
    private Invoice invoice;


    public CarRental() {
    }

    //O construtor da classe não contará com o atributo invoice, visto que o objeto da classe Invoice 
    //...não será instânciado antes e nem durante a chamada do contrutor
    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
}
