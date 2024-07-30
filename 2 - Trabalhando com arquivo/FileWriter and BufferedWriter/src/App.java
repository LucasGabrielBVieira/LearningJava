import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\Usuario\\Documents\\texto.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            //Para cada variável dentro do vetor
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}
