package util;

import java.util.function.Function;

import model.entities.Product;

public class UpperCaseName implements Function<Product, String> {
    //Implementação da interface em uma classe
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
