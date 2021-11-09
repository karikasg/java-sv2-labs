package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    //autókereskedés neve (szöveg), egy ár, ami azt jelöli, hogy legfeljebb mekkora értékű autókkal kereskedik (egész szám), és autók listája.
    // A kereskedés nevét és a felső limitet konstruktorban állítsd be, a lista kezdetben legyen üres.
    // Minden attribútumhoz tartozzon getter metódus.

    private String carShopName;
    private int maxValue;
    private List<Car> carList = new ArrayList<>();

    public CarShop(String carShopName, int maxValue) {
        this.carShopName = carShopName;
        this.maxValue = maxValue;
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car car : carList) {
            sum += car.getPrice();
        }
        return sum;
    }

    public List<Car> getCarsForSell() {
        return carList;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() > maxValue) {
            return false;
        }
        carList.add(car);
        return true;
    }

    public String getCarShopName() {
        return carShopName;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
