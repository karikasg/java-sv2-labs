package collectionsmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ClassTrip {
    Map<String, Integer> inpayments = new HashMap<>();

    public void loadInpayments (Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String[] elements;
            String line;
            while ((line = br.readLine()) != null) {
                elements = line.split(": ");
                String name = elements[0];
                int amount = Integer.parseInt(elements[1]);
                int base = inpayments.containsKey(name) ? inpayments.get(name) : 0;
                    inpayments.put(name, base + amount);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }

    }

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }
}
