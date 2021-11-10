package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username){
        return (username.length()>0);
    }

    public boolean isValidPassword(String password1, String password2){
        return (((password1.length())>7) && (password1.equals(password2)));
    }

    public boolean isValidEmail(String email){
        // Az email címben kell lennie @ karakternek és valamikor utána (de nem közvetlenül) pontnak.
        // A @ karakter nem lehet az első, az őt követő pont pedig az utolsó.

        // return ((email.indexOf("@")>0) && (email.indexOf(".", email.indexOf("@"))>(email.indexOf("@")+1)) && (email.indexOf(".")<(email.length()-1)));

        // Bár a feladat szövegének megfelel, de ha van már egy jó helyen lévő ".", de az email cím pontra végződik, azt elfogadja helyesnek.
        // Igazából elég lenne azt ellenőrizni, hogy az utolsó karakter nem lehet pont:
        return ((email.indexOf("@")>0) && (email.indexOf(".", email.indexOf("@"))>(email.indexOf("@")+1)) && (!email.substring(email.length()-1).equals(".")));
    }
}
