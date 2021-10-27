package finalmodifier;

public class TaxMain {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.tax(100));
        System.out.println(taxCalculator.priceWithTax(100));
    }
}
