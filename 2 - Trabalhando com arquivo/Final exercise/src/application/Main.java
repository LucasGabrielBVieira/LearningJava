package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Crianção da lista que ira conter os itens do arquivo
        List<Product> list = new ArrayList<>();

        //Pedido do caminho do arquivo para o usuário
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        //Transformando o caminho em um objeto file
        File sourceFile = new File(sourceFileStr);
        //Armazenando o caminho do diretório com getParents
        String sourceDirectory = sourceFile.getParent();

        //Executando a criação da subpasta
        boolean success = new File(sourceDirectory + "\\out").mkdir();

        System.out.println(success);

        //Criando o novo endereço onde o novo arquivo será criado
        String targetFileStr = sourceDirectory + "\\out\\summary.csv";


        //Lendo o arquivo com try-with-resources
        //O objeto br instanciado a partir da classe FileReader que recebe a String que contém o camiho do arquivo csv original
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
             
            String itemCsv = br.readLine();

            //Loop que lê o arquivo até que a próxima linha do arquivo seja Null
            while (itemCsv != null) {
                
                //Vetor que armazenará cada parte do arquivo separado por vírgula
                String[] fields = itemCsv.split(",");
                String name = fields[0];

                //Casting de String para double usando parseDouble da classe Double
                double price = Double.parseDouble(fields[1]);
                double quantity = Double.parseDouble(fields[2]);

                //Adicionando a lista a instancia da classe Produto
                list.add(new Product(name, price, quantity));

                //Leitura da próxima linha
                itemCsv = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Escrevendo no arquivo
        //Instanciando um objeto da classe BufferedWriter a partir da classe FileWriter que recebe o enderço em forma de String do novo arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

            //Desempacotamento dos objetos da classe Product contidos na Lista list
            for (Product item: list) {

                //Escrevendo o novo arquivo csv com getName() e a função total() da classe Product
                bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
