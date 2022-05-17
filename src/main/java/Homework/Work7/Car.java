package Homework.Work7;

public class Car {

    private String carModel;
    private CarMaker carMaker;
    private int carModelYear;
    private String color;

    Car() {
    }

    Car(CarMaker carMaker) {
        this.carMaker = carMaker;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarMaker(CarMaker carMaker) {
        this.carMaker = carMaker;
    }

    public void setCarModelYear(String carModelYear) {
        this.carModelYear = Integer.parseInt(carModelYear);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarModel() {
        return carModel;
    }

    public CarMaker getCarMaker() {
        return carMaker;
    }

    public int getCarModelYear() {
        return carModelYear;
    }

    public String getColor() {
        return color;
    }

    public String getCarMakerStr() {
        return carMaker.getMaker();
    }

    @Override
    public String toString() {
        return "\nCar {" +
                "carModel=" + carModel +
                ", carMaker='" + carMaker.getMaker() + '\'' +
                ", yearMake='" + carModelYear + '\'' +
                ", color='" + color + '\'' + '}';
    }
}


