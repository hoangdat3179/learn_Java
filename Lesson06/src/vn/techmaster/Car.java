package vn.techmaster;

public class Car {
    public String model;
    public String color;
    public String brand;

    public Car(String model, String color, String brand) {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }

    public void speed(){

    }

    public void size(){

    }

    public void Brand(){

    }

    @Override
    public String toString() {
        return "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "Brand: " + brand + '\n';
    }
}
