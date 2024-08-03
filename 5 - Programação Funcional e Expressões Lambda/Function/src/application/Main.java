package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.entities.Product;
import util.UpperCaseName;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Function lambda declarada
        Function<Product, String> func = p -> p.getName().toUpperCase();

        //Convertendo uma list em stream para usar a função map para usar a Function parametro em todos
        //... os elementos da lista, depois convertendo a stream de volta para lista com collect.
        //...(Collectors.toList()), para ser recebida por uma nova list de String, names.

        //Declaração inline
        List<String> names = list.stream().map(
            p -> p.getName().toUpperCase()
            ).collect(Collectors.toList());
        
        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
