package util;

import java.util.function.Predicate;

import model.entities.Product;


//Predicate com implementação da interface em uma classe
public class ProductPredicate  implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }

}
