package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {
        char[] t = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(t[i])) {
                t[i] = '*';
            }
        }
    return String.valueOf(t);
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Ez egy szöveg, amin lehet tesztelni"));
    }
}
