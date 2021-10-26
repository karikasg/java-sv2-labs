package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero(int[] numbers){       // nem tudom minek a visszatérési érték, amikor úgyis megváltozik az eredeti tömb -> clone()
        for (int i = numbers.length - 1; i >= 0; i -= 3){
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        EveryThird everyThird = new EveryThird();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(everyThird.changeToZero(array.clone())));
        System.out.println(Arrays.toString(array));
    }


}
