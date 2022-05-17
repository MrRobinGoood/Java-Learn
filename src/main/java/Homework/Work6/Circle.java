package Homework.Work6;

public class Circle extends GeomShape {
    public double lenR;

    public Circle(double lenR, Color color) {
        super(color);
        if (lenR <= 0) throw new IllegalArgumentException("Incorrect values of length radius");
        this.lenR = lenR;
    }

    public double getArea() {
        double r = this.lenR / 2;
        return (Math.pow(r, 2) * 3.14);
    }

    public double getLenR() {
        return this.lenR;
    }

    public String toString() {
        return "LenR = " + this.getLenR() + "\n" + "Area = " + this.getArea() + "\n";
    }
}

