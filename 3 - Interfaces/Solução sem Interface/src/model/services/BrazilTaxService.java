package model.services;

public class BrazilTaxService {

    //Classe que representa um serviço que contém apenas a função que determina a regra de imposto nacional

    public double tax(double amount) {
        //A lógica consiste em multiplicar o valor amount por 20% caso ele seja menor ou igual a 100
        //...caso contrário, ele será multiplicado por 15%
        if (amount <= 100) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
