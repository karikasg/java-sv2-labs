package statements;

public class StatementMain {

    public static void main(String[] args) {

        int x = 5 + 6;
        System.out.println("x: "+x);
        int y = 11 - x;
        System.out.println("y: "+y);
        int z = 8;
        System.out.println("z: "+z);
        boolean b = (x > y);
        System.out.println("b: "+b);
        boolean c = b || (z > 5);
        System.out.println("c: "+c);
        z++;
        System.out.println("z: "+z);
    }
}
