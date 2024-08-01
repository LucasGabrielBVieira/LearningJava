package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Employee> list = new ArrayList<>();
        String path = "c:\\Users\\Usuario\\Documents\\dados.csv";
        

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeCsv = br.readLine();
            while (employeCsv != null) {
                String[] fields = employeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee s : list) {
                System.out.println(s.getName() + ", " + s.getSalary() );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
