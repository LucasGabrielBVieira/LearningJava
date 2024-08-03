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

    //Consumer com method static
    //Chamado em forEach(Product::staticMethodProductConsumer);
    public static void staticMethodProductConsumer(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    //Consumer não static
    //Chamado em forEach(Product::nonStaticMethodConsumer);
    public void nonStaticMethodProductConsumer() {
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
    
}
