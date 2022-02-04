package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {

        List<Object> objectList = new ArrayList<>();
        Fruit fruit = new Fruit();
        objectList.add(fruit);
        Apple apple = new Apple();
        objectList.add(apple);
        Starking starking = new Starking();
        objectList.add(starking);
        Vegetable vegetable = new Vegetable();
        objectList.add(vegetable);
        objectList.add("alma");
        objectList.add(12);
        objectList.add('x');
        LocalDate localDate = LocalDate.of(2022, 02, 04);
        objectList.add(localDate);
        Integer[] intArray = new Integer[]{1, 2, 3, 4};
        objectList.add(intArray);
        System.out.println(objectList);
    }
}
