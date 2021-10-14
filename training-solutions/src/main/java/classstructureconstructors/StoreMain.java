package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store product1 = new Store("Ablak");
        Store product2 = new Store("Ajtó");

        System.out.println("1. termék: "+product1.getProduct()+" = "+product1.getStock());
        System.out.println("2. termék: "+product2.getProduct()+" = "+product2.getStock());

        System.out.println("Berakunk az 1. termékből 15-öt, a 2. termékből 12-őt");
        product1.store(15);
        product2.store(12);
        System.out.println("1. termék: "+product1.getProduct()+" = "+product1.getStock());
        System.out.println("2. termék: "+product2.getProduct()+" = "+product2.getStock());

        System.out.println("Kiveszünk az 1. termékből 8-at, a 2. termékből 4-et");
        product1.dispatch(8);
        product2.dispatch(4);
        System.out.println("1. termék: "+product1.getProduct()+" = "+product1.getStock());
        System.out.println("2. termék: "+product2.getProduct()+" = "+product2.getStock());

    }
}
