package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {

    public static void main(String[] args) {
        Message message = new Message();
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        System.out.println(message.codeArrayToString(codedMessage));
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101" /* nagy O betű a 0 helyett*/, "110", "101", "116", "46");
        System.out.println(message.codeArrayToString(anotherCodedMessage));
    }

    public StringBuilder codeArrayToString(List<String> codedMessage) {
        StringBuilder text = new StringBuilder();
        for (String chr : codedMessage) {
            text.append((char)Integer.parseInt(chr));
        }
        return text;
    }
}
