package stringtype.registration;

public class Registration {
    public static void main(String[] args) {
        UserValidator user = new UserValidator();
        String username = "kari";
        String password1 = "12345678";
        String password2 = "12345678";
        String email = "kari@mailprovider.hu"; // Tudom, konzolról... de így gyorsabb tesztelni

        System.out.println(user.isValidUsername(username) ? "Megfelelő felhasználói név" : "Hibás felhasználói név");
        System.out.println(user.isValidPassword(password1, password2) ? "Megfelelő jelszó" : "Hibás jelszó");
        System.out.println(user.isValidEmail(email) ? "Megfelelő email" : "Hibás email");
    }
}
