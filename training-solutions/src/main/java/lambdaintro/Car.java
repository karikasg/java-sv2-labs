package lambdaintro;

public class Car {
    String brand;
    String type;
    int price;
    double length;

    public Car(String brand, String type, int price, double length) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }
}
