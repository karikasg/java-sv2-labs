package exceptions.sum;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    int[] nullIntArray;
    String[] nullStringArray;

    @Test
    void testGetSum1() {
        NumbersSum numbersSum = new NumbersSum();
        assertEquals(45, numbersSum.getSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    void testGetSum2() {
        NumbersSum numbersSum = new NumbersSum();
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(nullIntArray));
    }

    @Test
    void testGetSum3() {
        NumbersSum numbersSum = new NumbersSum();
        assertEquals(55, numbersSum.getSum(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
    }

    @Test
    void testGetSum4() {
        NumbersSum numbersSum = new NumbersSum();
        assertThrows(IllegalArgumentException.class, () -> numbersSum.getSum(nullStringArray));
    }

    @Test
    void testGetSum5() {
        NumbersSum numbersSum = new NumbersSum();
        assertEquals(0, numbersSum.getSum(new String[]{}));
    }
}