package cmdarguments.flowers;

public class CmdMain {
    public static void main(String[] args) {
        System.out.println(args.length+" paramétert adtunk a programnak");
        for (int i=0; i< args.length; i++){
            System.out.println((i+1)+". elem: "+args[i]);
        }
    }
}
