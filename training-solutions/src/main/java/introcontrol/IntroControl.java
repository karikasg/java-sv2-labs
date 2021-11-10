package introcontrol;

public class IntroControl {

    //    A public int subtractTenIfGreaterThanTen(int number) metódusban add vissza a paraméterként átadott értéket, ha az kisebb vagy egyenlő, mint 10, ellenkező esetben csökkentsd 10-zel, és azt add vissza!
    public int subtractTenIfGreaterThanTen(int number){
        //return (number<=10 ? number : number - 10);
        if (number<=10) {
            return number;
        }
        else {
            return number - 10;
        }
    }

    //    A public String describeNumber(int number) metódusban adj vissza "zero" értéket, ha a paraméterként átadott érték 0, és "not zero" értéket, ha nem 0!
    public String describeNumber(int number){
        //return ((number == 0) ? "zero" : "not zero");
        if (number == 0) {
            return "zero";
        }
        else {
            return "not zero";
        }
    }

    //    A public String greetingToJoe(String name) metódusban adj vissza Hello Joe értéket, ha a paraméterként átadott név "Joe", és üres Stringet, ha nem!
    public String greetingToJoe(String name){
        //return ("Joe".equals(name) ? "Hello Joe" : "");
        if ("Joe".equals(name)) {
            return "Hello Joe";
        }
        else {
            return "";
        }
    }

//    Az értékesítők 10% jutalékot kapnak az eladások alapján, de csak abban az esetben, ha a havi eladás értéke legalább 1 000 000 Ft.
//    A public int calculateBonus(int sale) metódusban számold ki a jutalékot az eladási összeg alapján, és a jutalék összegét add vissza!
    public int calculateBonus(int sale){
        //return (sale >= 1000000) ? sale / 10 : 0;
        if (sale >= 1000000) {
            return sale / 10;
        }
        else {
            return 0;
        }
    }

//    A public int calculateConsumption(int prev, int next) metódusban számold ki a paraméterként megadott mérőóraállások közötti különbséget.
//    Ha a villanyóra eléri a 9999 értéket, átfordul, és újraindul 0 értéktől.
//    Tételezzük fel, hogy csak egyszer fordulhat át, és nem érheti el az előző értéket. Tételezzük fel, hogy 9999 értéknél nagyobbat nem kap paraméterül.
    public int calculateConsumption(int prev, int next){
        //return (prev < next) ? next - prev : 10000 - prev + next;
        if (prev < next) {
            return next - prev;
        }
        else {
            return 10000 - prev + next;
        }
    }

//            A public void printNumbers(int max) metódussal írd ki a pozitív egész számokat (nullával kezdve) egészen a paraméterként megadott számig (az is legyen kiírva).
    public void printNumbers(int max){
        for (int i = 0; i<=max; i++){
            System.out.println(i);
        }
    }

//    A public void printNumbersBetween(int min, int max) metódussal írd ki a pozitív egész számokat a két paraméterként megadott érték között (a megadott értékeket is beleértve).
//    Feltételezzük, hogy mindkét paraméterként kapott szám nagyobb vagy egyenlő nullával.
    public void printNumbersBetween(int min, int max){
        for (int i = min; i <= max; i++){
            System.out.println(i);
        }
    }

//            A public void printNumbersBetweenAnyDirection(int a, int b) metódussal írd ki a pozitív egész számokat a két paraméterként megadott érték között (a megadott értékeket is beleértve).
//            Ha az a értéke nagyobb, mint a b értéke, akkor csökkenő sorrendben történjen a kiíratás.
    public void printNumbersBetweenAnyDirection(int a, int b){
        if (a < b){
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
    }

    //            A public void printOddNumbers(int max) metódussal írd ki a páratlan pozitív egész számokat (egytől indítva) egészen a paraméterként megadott számig (az is legyen kiírva, ha páratlan)!
    public void printOddNumbers(int max){
        for (int i = 1; i <= max; i = i + 2){
            System.out.println(i);
        }
    }
}
