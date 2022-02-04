package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Kávé");
        coffee.setPrice(100);
        System.out.println(coffee.getName()+":"+coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Kapuccsinó");
        cappuccino.setPrice(150);
        System.out.println(cappuccino.getName()+":"+cappuccino.getPrice());
    }
}
