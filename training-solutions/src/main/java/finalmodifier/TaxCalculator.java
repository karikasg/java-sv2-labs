package finalmodifier;

public class TaxCalculator {
    public static final int AFA = 27;

    public double tax(double price){
        return price * AFA / 100;
    }

    public double priceWithTax(double price){
        return price + tax(price);
    }
}
