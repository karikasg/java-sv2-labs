package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        String[] importantThingsArray = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<4; i++){
            System.out.print(i + ". legfontosabb dolog: ");
            importantThingsArray[i-1]=scanner.nextLine();
        }

        List<String> importantThings = Arrays.asList(importantThingsArray);
        System.out.println(importantThings);
        importantThings.set(1, "Valami más");
        System.out.println(importantThings);
    }
}
