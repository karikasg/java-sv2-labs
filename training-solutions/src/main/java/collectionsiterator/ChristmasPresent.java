package collectionsiterator;

public class ChristmasPresent {
    private String description;
    private String nameOfPerson;
    private int price;

    public ChristmasPresent(String present, String person, int price) {
        this.description = present;
        this.nameOfPerson = person;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getPrice() {
        return price;
    }
}
