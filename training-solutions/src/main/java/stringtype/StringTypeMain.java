package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + "444";
        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String empty = "" + "";
        System.out.println(empty);
        System.out.println(empty.length());

        String abcde = "Abcde";
        System.out.println(abcde.length());
        System.out.println(abcde.substring(0,1) + "," + abcde.substring(2,3));
        System.out.println(abcde.substring(0,3));
    }
}

