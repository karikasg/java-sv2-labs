package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("PhD.");
        FirstName firstName = new FirstName("Gábor");
        LastName lastName = new LastName("Karikás");

        System.out.println("Név: " + prefix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast());
    }
}
