import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "C:\\Users\\Usuario\\Documents\\arquivo.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            //BufferedReader é instanciado a partir de FileReader, nele há o buffer que agiliza a leitura
            br = new BufferedReader(fr);

            //A próxima linha será armazenada em uma String para a manipulação posterior
            String line = br.readLine();

            //É preciso a checagem de que a próxima linha existe
            while (line != null) {
                //Loop que finalizará a leitura
                System.out.println(line);
                line = br.readLine();
            }
        
        } catch (IOException e) {
            //Capturando uma excessão na abertura do arquivo
            System.err.println("Erro" + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                //Capturando exceção possível no fechamento do FileReader e BufferedReader
                e.printStackTrace();
            }
        }

    }
}
