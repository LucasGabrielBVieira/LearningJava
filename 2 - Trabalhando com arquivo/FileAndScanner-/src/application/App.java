package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Usuario\\Documents\\arquivo.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            //Confere se o objeto foi instanciado antes de fecha-lo
            if (sc != null) {
                sc.close();
            }
        }
    }
}
