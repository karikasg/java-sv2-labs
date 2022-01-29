package interfacedependencyinversion;

public class CourierCompany {

    public static void main(String[] args) {
        Box sBox = new SmallBox();
        Box mBox = new MediumBox();
        Box lBox = new LargeBox();
        Box xlBox = new ExtraLargeBox();

        System.out.println(sBox.getSize()+" "+sBox.getPrice());
        System.out.println(mBox.getSize()+" "+mBox.getPrice());
        System.out.println(lBox.getSize()+" "+lBox.getPrice());
        System.out.println(xlBox.getSize()+" "+xlBox.getPrice());
    }
}
