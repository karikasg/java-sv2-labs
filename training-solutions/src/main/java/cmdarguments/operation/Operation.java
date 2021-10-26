package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String arg : args){
            switch (arg) {
                case "/list" -> System.out.println("Listázás");
                case "/add" -> System.out.println("Hozzáadás");
                case "/delete" -> System.out.println("Törlés");
                default -> System.out.println("Ismeretlen művelet");
            }
        }

    }
}
