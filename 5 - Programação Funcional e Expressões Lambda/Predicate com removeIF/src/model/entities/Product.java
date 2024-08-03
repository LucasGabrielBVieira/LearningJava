package model.entities;

public class Product {

    private String name;
    private Double price;
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Predicate implementado em forma de static method na classe
    //..., nela será recebido um obj Product como parâmetro, e o method pode
    //... ser chamado com list.removeIf(Product::staticMethodPredicateProduct);
    public static boolean staticMethodPredicateProduct(Product p) {
        return p.getPrice() >= 100.00;
    }

    //Feito agora em método não static que irá trabalhar com o próprio objeto instânciado
    //..., pode ser chamada com list.removeIf(Product::nonStaticMethodPredicateProduct);
    public boolean nonStaticMethodPredicateProduct() {
        return price >= 100.00;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}
