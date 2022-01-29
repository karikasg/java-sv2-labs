package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remainder {
    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor) {
        numbers.replaceAll(o -> o % divisor);
        return numbers;
    }

    public static void main(String[] args) {
        Remainder remainder = new Remainder();
        System.out.println(remainder.changeNumbersToRemainders(Arrays.asList(45, 13, 64, 51, 92, 33), 3));
    }
}
