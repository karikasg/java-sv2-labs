package introexceptiontrace;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

     private List<Fish> ornamentalFish;// = new ArrayList<>(); // nullpointer exception, nincs példányosítva

     public List<Fish> getOrnamentalFish() {
         return ornamentalFish;
     }

     public void addFish(Fish fish) {
         ornamentalFish.add(fish);
     }

     public int getNumberOfFish() {
         return ornamentalFish.size();
     }
}

