package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeTooExpensivePresent(int price) {
        for (Iterator<ChristmasPresent> i = presents.iterator(); i.hasNext(); ) {
            if (i.next().getPrice() > price) {
                i.remove();
            }
        }
    }
}
