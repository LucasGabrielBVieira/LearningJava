import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); 

        File[] folders = path.listFiles(File::isDirectory);

        for (File folder: folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        for (File file: files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\Novo Diretório").mkdir();

        System.out.println("Diretory created successfully: " + success);

        sc.close();
    }
}
