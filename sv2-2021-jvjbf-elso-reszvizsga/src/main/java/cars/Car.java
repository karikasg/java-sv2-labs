package cars;

public class Car {
    //Minden autónak van egy márkája (szöveg), egy motormérete (lebegőpontos szám),
    // egy színe (felsorolásos típus, a következő felsorolókkal: RED,BLACK,BLUE,GREY) és egy ára (egész szám).


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
