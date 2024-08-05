import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Declaração de variável
        //tipo nome = dado;
        int idade_global = 50;

        //Declaração de variável local
        // var <nome> = <dado> 
        //Nessa declaração a tipagem é dinâmica
        var idade = 14;
        //Nessa declaração, é preciso influir a declaração do valor

        //Tipos primitivos do java
        //Números : byte, short, int, long
        //Números com pontos flutuantes: float e double
        float number = 50.89F;
        //booleano: boolean
        //caracter: char
        //String não é um tipo primitivo em Java, e sim uma classe

        //Condicionais
        if (idade > idade_global) {
            System.out.println("Idade global é menor");
        } else if (idade == idade_global) {
            System.out.println("Idades iguais");
        } else {
            System.out.println("Idade global é maior");
        }
        if (number == 89.00F) {
            System.out.println("Esses números são iguais");
        }

        //Array 
        //Há duas maneiras de declarar
        int[] idades = {2, 33, 76, 34, 52};
        //ou
        int[] idades_reservadas = new int[10];
        //Para adicionar um elemento
        //idades_reservadas[0] = 7;
        //Para seber o tamanho
        //idades.length

        //Array Dinâmico
        //Para uma estrutura de dados tipica de uma lista dinâmica, é usado array list, uma biblioteca do java.util
        ArrayList<Integer> idades_list = new ArrayList<Integer>();
        //adicionar, deletar, pegar, e tamanho da lista
        idades_list.add(5);
        idades_list.remove(0);
        //idades_list.get(0);
        idades_list.size();

        //Condicionais
        int c = 0;
        for (var i = 0; i < idades_reservadas.length; i++) {
            if (i % 2 == 0) {
                idades_reservadas[i] = idades[c];
                c++;
            } else {
                idades_reservadas[i] = i;
            }
        }
        var i = 0;
        while (i < idades_reservadas.length) {
            System.out.println(idades_reservadas[i]);
            i++;
        }

        //Casting
        //Implicíto
        int a = 22;
        double b = a;

        //Explícito
        int d = (int) b;

        char e = 'a';
        String f = String.valueOf(e);

    }
}