package numbers;

public class Percent {

    public double getValue(int nr1, int nr2) {
        return nr1 * nr2 / 100.0;
    }

    public double getBase(int nr1, int nr2) {
        return nr1 * 100.0 / nr2;
    }

    public double getPercent(int nr1, int nr2) {
        return nr2 * 100.0 / nr1;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(200, 30));
        System.out.println(percent.getBase(60, 30));
        System.out.println(percent.getPercent(60, 30));
    }
}
