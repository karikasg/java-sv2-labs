package conversions;

import mathproblems.Division;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                numbers.add(c-48);
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("a21f4f342j3e5b23r45");
        System.out.println(digits.getNumbers());
    }
}
