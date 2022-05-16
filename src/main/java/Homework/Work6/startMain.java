package Homework.Work6;

import java.util.Scanner;

public class startMain {
    public static void main(String[] args) {
        GeomShape triangle = new GeomShape(5, 2, 3);
        GeomShape rectangle = new GeomShape(5, 2);
        GeomShape square = new GeomShape(5, 5);
        GeomShape circle = new GeomShape(7);

        triangle.setColorSys("RGB");
        triangle.setColorABC(20, 50, 70);
        triangle.printAllAbout();

        rectangle.setColorSys("HSB");
        rectangle.setColorABC(270, 40, 10);
        rectangle.printAllAbout();

        square.printAllAbout();

        circle.setColorSys("RGB");
        circle.setColorABC(10, 10, 10);
        circle.printAllAbout();

    }
}
