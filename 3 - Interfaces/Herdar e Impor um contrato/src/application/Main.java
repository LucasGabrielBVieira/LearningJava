package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.enumerate.Color;
import model.entities.AbstractShape;

public class Main {
    public static void main(String[] args) throws Exception {

        AbstractShape a1 = new Circle(Color.BLACK, 2.0);
        AbstractShape a2 = new Rectangle(Color.WHITE, 4.0, 3.0);

        System.out.println(a1.getColor());
        System.out.println(a1.area());
        System.out.println(a2.getColor());
        System.out.println(a2.area());


    }
}
