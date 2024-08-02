package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria"); //Insere um elemento no map K/V
        cookies.put("email", "maria@gmail.com"); 
        cookies.put("phone", "99711122"); 
        
        cookies.remove("email");
        cookies.put("phone", "99771133"); 
        //Nesse caso, o map vai sobrescrever o valor que a chave key contém 

        System.out.println(cookies.containsKey("phone"));
        //Retorna um boolean true caso o parametro respresente uma chave existente,
        //...senão ele retorna null

        System.out.println(cookies.get("phone"));
        //Pega o valor da chave

        System.out.println(cookies.size());

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) //Retorna um set com as chaves do map
        {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
