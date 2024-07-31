package model.entities;

public class Vehicle {

    //Classe separa para o veículo
    //Nele, só haverá o atributo model 
    //Ele terá uma conexão de composição com a classe CarRental, onde será contido 

    private String model;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
}
