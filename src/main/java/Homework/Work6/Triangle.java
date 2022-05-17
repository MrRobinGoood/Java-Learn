package Homework.Work6;

public class Triangle extends GeomShape {

    public double lenA;
    public double lenB;
    public double lenC;

    public Triangle(double lenA, double lenB, double lenC, Color color) {
        super(color);
        if (lenA <= 0 || lenB <= 0 || lenC <= 0) throw new IllegalArgumentException("Incorrect value of length");
        this.lenA = lenA;
        this.lenB = lenB;
        this.lenC = lenC;

        if (this.lenA + this.lenB < this.lenC
                || this.lenB + this.lenC < this.lenA
                || this.lenC + this.lenA < this.lenB) {
            throw new IllegalArgumentException("Incorrect value of length");
        }
    }

    public double getLenA() {
        return this.lenA;
    }

    public double getLenB() {
        return this.lenB;
    }

    public double getLenC() {
        return this.lenC;
    }

    public double getArea() {
        double p;
        p = (this.lenA + this.lenB + this.lenC) / 2;
        return Math.sqrt(p * (p - this.lenA) * (p - this.lenB) * (p - this.lenC));
    }

    public String toString() {
        return "LenA = " + this.getLenA() + "\n" + "LenB = " + this.getLenB() + "\n" + "LenC = " + this.getLenC() + "\n" + "Area = " + this.getArea() + "\n";
    }
}

