package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;
import util.ProductPredicate;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //De maneira declarada, inclusive, pode ser trabalhada com variáveis fora da declaração
        Predicate<Product> pred = p -> p.getPrice() >= 100.00;

        //list.removeIf(pred);
        list.removeIf(p  -> p.getPrice() >= 100.0);
        //Maneira inline de declaração da Predicate.

        for (Product produto : list) {
            System.out.println(produto);
        }
    }
}
