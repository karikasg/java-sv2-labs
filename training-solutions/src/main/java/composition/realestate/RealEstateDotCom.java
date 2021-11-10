package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Budapest", "1055", "Kossuth tér", 1);
        Details details = new Details("Asylum", address, 17745, 100000);
        RealEstate realEstate = new RealEstate("Lakás", 1, details);

        System.out.println(realEstate);
    }


}
