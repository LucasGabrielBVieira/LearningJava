package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Set<String> set = new HashSet<>();
        //HashSet - Não garante ordem - rápido
        //TreeSet - Ordedado pelo compareTo do Objeto - lento
        //LinkedSet - Ordenado pela ordem de em que são adicionados - intemediário

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');
        // x tal que x tenha o elemento char do index 0 igual ao T

        for (String str : set) {
            System.out.println(str);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //|União
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Interseção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Difenrença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);


    }
}
