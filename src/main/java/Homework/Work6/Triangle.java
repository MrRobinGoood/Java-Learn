package Homework.Work6;

public class Triangle extends GeomShape {

    public double lenA;
    public double lenB;
    public double lenC;

    public Triangle(double sides1, double sides2, double sides3, Color color) {
        super(color);
        if (sides1 <= 0 || sides2 <= 0 || sides3 <= 0) throw new IllegalArgumentException("Incorrect value of length");
        this.lenA = sides1;
        this.lenB = sides2;
        this.lenC = sides3;

        if (this.lenA + this.lenB < this.lenC
                || this.lenB + this.lenC < this.lenA
                || this.lenC + this.lenA < this.lenB) {
            throw new IllegalArgumentException("Incorrect value of length");
        }
    }

    public double getArea() {
        double p;
        p = (this.lenA + this.lenB + this.lenC) / 2;
        return Math.sqrt(p * (p - this.lenA) * (p - this.lenB) * (p - this.lenC));
    }

    public double getSides1() {
        return this.lenA;
    }

    public double getSides2() {
        return this.lenB;
    }

    public double getSides3() {
        return this.lenC;
    }

    public String toString() {
        return "LenA = " + this.getSides1() + "\n" + "LenB = " + this.getSides2() + "\n" + "LenC = " + this.getSides3() + "\n" + "Area = " + this.getArea() + "\n";
    }
}

