package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.service.CalculationService;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        String path = "c:\\users\\Usuario\\Documents\\dados.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] i = line.split(",");
                list.add(new Product(i[0], Double.parseDouble(i[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
