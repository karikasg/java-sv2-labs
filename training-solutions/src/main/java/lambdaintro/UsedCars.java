package lambdaintro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsedCars {
    List<Car> usedCars = new ArrayList<>();

    public List<Car> listCarsByPrice() {
        List<Car> result = new ArrayList<>(usedCars);
        result.sort(Comparator.comparingInt(Car::getPrice));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> result = new ArrayList<>(usedCars);
        result.sort((car1, car2) -> Double.compare(car2.getLength(), car1.getLength()));
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> result = new ArrayList<>(usedCars);
        return result.stream().filter(o->o.getBrand().equals(brand)).sorted(Comparator.comparing(Car::getType)).toList();
    }

    public UsedCars(List<Car> usedCars) {
        this.usedCars = usedCars;
    }
}
