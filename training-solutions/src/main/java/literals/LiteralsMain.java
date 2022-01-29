package literals;

import java.util.Locale;

public class LiteralsMain {
    //Definiálj egy String word változót, melynek az értéke legyen a TITLE szöveg nagybetűkkel!
    // A szövegliterál eredetileg kisbetűkből álljon, és hajtsuk végre rajta a toUpperCase() metódust az értékadás előtt!

    public static void main(String[] args) {
        String word = "title".toUpperCase();
        System.out.println(word);
    }
}
