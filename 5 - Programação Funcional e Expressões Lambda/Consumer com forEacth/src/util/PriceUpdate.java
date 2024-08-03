package util;

import java.util.function.Consumer;

import model.entities.Product;

//Predicate com implementação da interface em uma classe
public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
