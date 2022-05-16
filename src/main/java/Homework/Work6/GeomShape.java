package Homework.Work6;

import static java.lang.Math.pow;

public class GeomShape {
    private double a;
    private double b;
    private double c;
    private String type;
    private double area;

    public GeomShape() {
    }

    public GeomShape(double a) throws GeomShapeException {
        if (a <= 0) {
            throw new GeomShapeException("Недопустимые размеры фигуры");
        }
        this.a = a;
        this.type = "Circle";
        this.b = -1;
        this.c = -1;
    }

    public GeomShape(double a, double b) throws GeomShapeException {
        if ((a <= 0) || (b <= 0)) {
            throw new GeomShapeException("Недопустимые размеры фигуры");
        }
        this.a = a;
        this.b = b;
        if (a == b) {
            this.type = "Square";
        } else {
            this.type = "Rectangle";
        }
        this.c = -1;
    }

    public GeomShape(double a, double b, double c) throws GeomShapeException {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new GeomShapeException("Недопустимые размеры фигуры");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = "Triangle";
    }

    public double[] getLengthOfSidesOrRadius() {
        if (b == -1) {
            double[] lengthOfRadius = new double[1];
            lengthOfRadius[0] = a;
            return lengthOfRadius;
        } else if (c == -1) {
            double[] lengthOfSides = new double[2];
            lengthOfSides[0] = a;
            lengthOfSides[1] = b;
            return lengthOfSides;
        } else {
            double[] lengthOfSides = new double[3];
            lengthOfSides[0] = a;
            lengthOfSides[1] = b;
            lengthOfSides[2] = c;
            return lengthOfSides;
        }
    }

    public double getArea() {
        if (b == -1) {
            return 3.14 * pow(a, 2);
        } else if (c == -1) {
            return a * b;
        } else {
            return a * b * c;
        }
    }

    public void printAllAbout() {
        System.out.println("Type: " + type);

        if (b == -1) {
            System.out.println("Length of Radius: ");
            System.out.println("A = " + a + ";");
        } else if (c == -1) {
            System.out.println("Length of Sides: ");
            System.out.println("A = " + a + "; B = " + b + ";");
        } else {
            System.out.println("Length of Sides: ");
            System.out.println("A = " + a + "; B = " + b + "; C = " + c + ";");
        }
        System.out.println("Area = " + this.getArea());
    }

}
