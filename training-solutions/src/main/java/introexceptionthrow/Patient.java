package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;


    public static void main(String[] args) {

        Patient patient = new Patient("Karikás Gábor", "028185798", 1968);
        System.out.println(patient.toString());
    }

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        SsnValidator ssnValidator = new SsnValidator();
        if (((name.length() == 0)) || (yearOfBirth < 1900) || (!ssnValidator.isValidSsn(socialSecurityNumber))) {
            throw new IllegalArgumentException("Hiba az adatokban!");
        } else {
            this.name = name;
            this.socialSecurityNumber = socialSecurityNumber;
            this.yearOfBirth = yearOfBirth;
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth;
        }


    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

}
