package compositionlist;

public class CapsulesMain {
    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("fekete");
        capsules.addLast("kék");
        capsules.addLast("zöld");
        capsules.addFirst("sárga");
        capsules.addFirst("fehér");
        capsules.addFirst("piros");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
