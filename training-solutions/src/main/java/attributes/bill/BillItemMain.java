package attributes.bill;

public class BillItemMain {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("Könyv", 2490, 4, 27);
        System.out.println(billItem.calculateTotalPrice());
    }
}
