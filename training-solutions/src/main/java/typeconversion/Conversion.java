package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number) {
        int intNumber = (int) number;
        return intNumber;
    }

    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.convertDoubleToDouble(123.45));
    }
}
