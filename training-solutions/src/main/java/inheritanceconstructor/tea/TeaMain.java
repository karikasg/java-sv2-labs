package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Tea", 100);
        HerbalTea herbalTea = new HerbalTea("Herbal tea", 150);

        System.out.println(tea.getName()+":"+tea.getPrice());
        System.out.println(herbalTea.getName()+":"+herbalTea.getPrice());

    }
}
