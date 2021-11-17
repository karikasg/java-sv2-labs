package introexceptiontrace;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        for (int number : change.changeNumbers()) {
            System.out.print(number + " ");
        }
    }
}
