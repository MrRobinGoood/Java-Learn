package Homework.Work6;

import java.sql.SQLOutput;

import static java.lang.Math.pow;

public class GeomShape {
    private double a;
    private double b;
    private double c;
    private String type;
    private double area;
    private String ColorSys = "Unselected";
    private int[] colorABC = new int[3];


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

    public String getColorSys() {
        return ColorSys;
    }

    public void setColorSys(String str) throws ColorShapeException {
        if ((str.equals("RGB")) || (str.equals("HSB"))) {
            this.ColorSys = str;
        } else {
            throw new ColorShapeException("Недопустимая цветовая система");
        }
    }

    public int[] getColorABC() {
        return colorABC;
    }

    public void setColorABC(int colA, int colB, int colC) throws ColorShapeException {
        if ((this.ColorSys.equals("RGB")) && (((colA > 265) && (colA < 0)) || ((colB > 265) && (colB < 0)) || ((colC > 265) && (colC < 0)))) {
            throw new ColorShapeException("Недопустимые значения в данной цветовой системе");
        } else if ((this.ColorSys.equals("HSB")) && (((colA > 360) && (colA < 0)) || ((colB > 100) && (colB < 0)) || ((colC > 100) && (colC < 0)))) {
            throw new ColorShapeException("Недопустимые значения в данной цветовой системе");
        } else if ((this.ColorSys.equals("RGB")) || (this.ColorSys.equals("HSB"))) {
            this.colorABC[0] = colA;
            this.colorABC[1] = colB;
            this.colorABC[2] = colC;
        } else {
            throw new ColorShapeException("Сначала выберите цветовую схему");
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
        if ((this.ColorSys.equals("RGB")) || (this.ColorSys.equals("HSB"))) {
            System.out.println("Color system: " + this.getColorSys());
            System.out.println("Color A = " + colorABC[0] + "; Color B = " + colorABC[1] + "; Color C = " + colorABC[2] + ";");
        } else {
            System.out.println("Цветовая система не выбрана.");
        }
        System.out.println();
    }

}
