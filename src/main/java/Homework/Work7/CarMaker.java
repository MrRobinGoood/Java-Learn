package Homework.Work7;


import java.util.*;

public class CarMaker {
    String maker;
    List<Car> car;

    public CarMaker(String maker, List<Car> cars) {
        this.car = cars;
        this.maker = maker;
    }

    public CarMaker(String value) {
        this.maker = value;
    }

    public void setCars(List<Car> cars) {
        this.car = cars;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public List<Car> getCars() {
        return car;
    }

    @Override
    public String toString() {
        if (car != null)
            return "\ncarMaker: " + getMaker() + " {" + car.toString()
                    + "}";
        return "\ncarMaker: " + getMaker();
    }
}


