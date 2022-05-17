package Homework.Work6;

import java.sql.SQLOutput;

import static java.lang.Math.pow;

public class GeomShape {
    public Color color;

    public GeomShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    void setColor(Color color) {
        boolean flag = color.isColor();
        if (!flag) throw new IllegalArgumentException("wrong color value");
        this.color = color;
    }

}




