package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Üres paramétertömb");
        }
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Üres paramétertömb");
        }
        int sum = 0;
        try {
            for (String s : numbers) {
                sum += Integer.parseInt(s);
            }
        } catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Nem alakítható számmá");
        }
        return sum;
    }
}
