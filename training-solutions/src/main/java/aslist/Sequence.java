package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList(Arrays.asList(1, 2));  //erre warningot ad (így van a leckében leírva), de működik
        for (int i=2; i<7; i++) {                                     //ha írok <>-t, ahogy a megoldásban van, akkor jó
            elements.add(elements.get(i-1) * elements.get(i-2));      //használható ez így is? mi a különbség?
        }

        System.out.println(elements);
        System.out.println(elements.size());
    }
}
