package application;

import model.entities.Cliente;

public class Main {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "maria@gmail.com");

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1 == c2); //Compara as referências de memória

    }
}
