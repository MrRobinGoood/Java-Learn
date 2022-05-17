package Homework.Work6;

public class Rectangle extends GeomShape {
    public double lenA;
    public double lenB;

    public Rectangle(double lenA, double lenB, Color color) {
        super(color);
        if (lenA <= 0 || lenB <= 0) throw new IllegalArgumentException("Incorrect value of length");
        this.lenA = lenA;
        this.lenB = lenB;
    }

    public double getArea() {
        return this.lenA * this.lenB;
    }

    public double getLenA() {
        return this.lenA;
    }

    public double getLenB() {
        return this.lenB;
    }

    public String toString() {
        return "LenA = " + this.getLenA() + "\n" + "LenB = " + this.getLenB() + "\n" + "Area = " + this.getArea() + "\n";
    }
}

