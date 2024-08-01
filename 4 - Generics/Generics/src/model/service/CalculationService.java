package model.service;

import java.util.List;

public class CalculationService {


    //Esse método utiliza generator para poder fazer comparações de qualquer objeto que tenha 
    //...implemente Comparable.
    //public static de um tipo T qualquer desde que que este tipo T implemente Comperable 
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
