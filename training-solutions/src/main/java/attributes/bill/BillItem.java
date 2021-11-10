package attributes.bill;

public class BillItem {
    // legyen egy String product, egy int price, egy int quantity és egy double vatPercent attribútuma! Legyen az osztályban konstruktor, valamint legyenek getter metódusok!
    // Legyen egy calculateTotalPrice() metódus is, mely kiszámolja az ár, a mennyiség és az ÁFA százalék alapján az adott számlatétel teljes összegét!
    //
    //A Bill osztály main() metódusával teszteld!
    private String product;
    private int price;
    private int quantity;
    private double vatPercent;

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }

    public double calculateTotalPrice(){
        return (price * quantity) * (1 + vatPercent / 100);
    }
}
