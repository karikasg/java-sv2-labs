package introexceptionthrow;

import java.util.logging.SocketHandler;

public class SsnValidator {

    public boolean isValidSsn(String socialSecurityNumber) {

        int sum = 0;
        char chr;
        if (socialSecurityNumber.length() != 9) {
            throw new IllegalArgumentException("A TAJ számnak 9 jegyűnek kell lennie");
        }
        for (int i=0; i<socialSecurityNumber.length()-1; i++) {
            chr = socialSecurityNumber.charAt(i);
            if ((chr < '0') || (chr > '9')) {
                throw new IllegalArgumentException("A TAJ szám csak számokat tartalmazhat");
            } else {
                if (i % 2 == 0) {
                    sum += (chr - 48) * 3;
                } else {
                    sum += (chr - 48) * 7;
                }
            }
        }
        if (((char)socialSecurityNumber.charAt(8) - 48 )  == (sum % 10)) {
            return true;
        } else {
            return false;
        }
    }
}
