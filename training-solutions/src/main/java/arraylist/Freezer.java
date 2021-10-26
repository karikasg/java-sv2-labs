package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> freezer = new ArrayList<>(); // hát ez most nem fagyasztó lesz, csak sima hűtő a tartalma alapján :)
        freezer.add("Sajt");
        freezer.add("Vaj");
        freezer.add("Paradicsom");
        freezer.add("Tej");
        freezer.add("Sonka");
        System.out.println(freezer);
        System.out.println(freezer.size());
        freezer.remove("Tej");
        freezer.remove("Vaj");
        System.out.println(freezer);
        System.out.println(freezer.size());
    }
}
