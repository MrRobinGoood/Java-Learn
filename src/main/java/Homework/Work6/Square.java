package Homework.Work6;

public class Square extends GeomShape {
    public double lenA;

    public Square(double lenA, Color color) {
        super(color);
        if (lenA <= 0) throw new IllegalArgumentException("Incorrect value of length");
        this.lenA = lenA;
    }

    public double getArea() {
        return this.lenA * this.lenA;
    }

    public double getSides() {
        return this.lenA;
    }

    public String toString() {
        return "LenA = " + this.getSides() + "\n" + "Area = " + this.getArea() + "\n";
    }

}

