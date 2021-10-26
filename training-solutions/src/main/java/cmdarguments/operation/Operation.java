package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String arg : args){
            switch (arg){
                case "/list":
                    System.out.println("Listázás");break;
                case "/add":
                    System.out.println("Hozzáadás");break;
                case "/delete":
                    System.out.println("Törlés");break;
                default:
                    System.out.println("Ismeretlen művelet");
            }
        }

    }
}
