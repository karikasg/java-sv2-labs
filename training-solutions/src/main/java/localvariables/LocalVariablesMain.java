package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {

        boolean b;
//        System.out.println(b);
        b = false;
        System.out.println(b);

        int a = 2;
        System.out.println(a);

        int i = 3;
        int j = 4;
//        System.out.println(k);
        int k = i;
        System.out.println(i+" "+j+" "+k);

        String s = "Hello World";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(x);
            System.out.println(b+" "+a+" "+i+" "+j+" "+k+" "+s+" "+t);
        }
//        System.out.println(x);
    }
}
