package collectionscomp;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building o) {
        return Integer.valueOf(levels).compareTo(o.getLevels());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                '}';
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Budapest", 123, 2));
        buildings.add(new Building("Budapest", 234, 4));
        buildings.add(new Building("Békéscsaba", 12, 1));
        buildings.add(new Building("Győr", 123, 3));
        buildings.add(new Building("Nógrád", 13, 5));
        buildings.add(new Building("Szeged", 1234, 6));

        System.out.println(buildings);
    }
}
