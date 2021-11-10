package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colours = new ArrayList<>();

    public void addLast(String colour){
        colours.add(colour);
    }

    public void addFirst(String colour){
        colours.add(0, colour);
    }

    public void removeFirst(){
        colours.remove(0);
    }

    public void removeLast(){
        colours.remove(colours.size()-1);
    }

    public List<String> getColors(){
        return colours;
    }

}
