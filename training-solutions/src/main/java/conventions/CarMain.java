package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Trabant", "2 ütemű benzines", 2, 4);
        System.out.println("Az autó adatai: "+car.getCarType()+", "+car.getEngineType()+", "+car.getDoors()+" ajtós, "+car.getPersons()+" személyes");
        car.addModelName("601");
        System.out.println("Az autó adatai: "+car.getCarType()+", "+car.getEngineType()+", "+car.getDoors()+" ajtós, "+car.getPersons()+" személyes");
        car.setCarType("Zsiguli");
        car.setEngineType("4 ütemű benzines");
        car.setDoors(4);
        car.setPersons(5);
        System.out.println("Az autó adatai: "+car.getCarType()+", "+car.getEngineType()+", "+car.getDoors()+" ajtós, "+car.getPersons()+" személyes");
    }
}
