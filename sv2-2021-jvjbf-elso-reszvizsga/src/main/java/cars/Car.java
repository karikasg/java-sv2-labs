package cars;

public class Car {

    private String brand;
    private double motorSize;
    public Color color;
    private int price;

    public Car(String brand, double motorSize, Color color, int price) {
        this.brand = brand;
        this.motorSize = motorSize;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent) {
        price *= (double) (100 - percent) / 100;
    }

    public String getBrand() {
        return brand;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public int getPrice() {
        return price;
    }
}
