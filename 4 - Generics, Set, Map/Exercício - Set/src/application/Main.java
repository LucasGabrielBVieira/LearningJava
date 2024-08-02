package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A?: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            a.add(sc.nextInt());
        }
        System.out.print("How many students for course B?: ");
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            b.add(sc.nextInt());
        }
        System.out.print("How many students for course C?: ");
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            c.add(sc.nextInt());
        }
        
        Set<Integer> allCouse = new HashSet<>(a);
        allCouse.addAll(b);
        allCouse.addAll(c);

        System.out.println("Total Students: " + allCouse.size());

        sc.close();
    }
}
