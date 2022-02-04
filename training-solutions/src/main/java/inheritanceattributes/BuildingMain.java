package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Building", 156, 1);
        SchoolBuilding schoolBuilding = new SchoolBuilding("School building", 2000, 2, 12);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
