package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map <String, Integer> map = new LinkedHashMap<>();
        
        System.out.println("Enter a file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();    
            while (line != null) {
                
                String[] fields = line.split(",");
                String candidato = fields[0];

                int votos;
                if (map.get(candidato) != null) {
                    votos = Integer.valueOf(fields[1]) + map.get(candidato);
                } else {
                    votos = Integer.valueOf(fields[1]);
                }

                map.put(candidato, votos);

                line = br.readLine();
            }
        }
        for (Object item : map.keySet()) {
            System.out.println(item + ": " + map.get(item));
        }

    }
}
