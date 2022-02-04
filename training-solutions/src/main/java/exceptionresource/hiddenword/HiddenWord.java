package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path) {
        String result ="";

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                char letter = ' ';
                for (char c : line.toCharArray()) {
                    if (c < '0' || c > '9') {
                        letter = c;
                    }
                }
                result += letter;
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        return result;
    }
}
