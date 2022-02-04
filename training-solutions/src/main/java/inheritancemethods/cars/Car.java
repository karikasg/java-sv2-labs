package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;


    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
        if (this.fuel < 0) {
            this.fuel = 0;
        }
    }

    public void drive (int km) { // csökkenti az üzemanyag mennyiségét, nem fogyhat ki!
        if (isEnoughFuel(km)) {
            modifyFuelAmount(fuelRate * km / -100.0);
        }
    }

    public double calculateRefillAmount() {//kiszámolja, mennyit lehet tankolni
        return tankCapacity - fuel;
    }

    private boolean isEnoughFuel(int km) {
        return (fuel - km * fuelRate / 100) >= 0.0;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
