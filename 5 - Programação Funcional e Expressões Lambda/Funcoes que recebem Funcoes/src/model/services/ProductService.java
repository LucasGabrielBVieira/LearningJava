package model.services;

import model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    //Função que é capaz de receber um predicado e usa-ló como condição para a função que será executada
    public Double filteredSum(List<Product> products, Predicate<Product> predicate) {
        double sum = 0.0;
        for (Product product : products) {
            //predicate.test(product) vai por o predicado como condição
            if (predicate.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
