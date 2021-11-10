package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Francis Carsac", "Sehollakók");
        book.register("9632113845");
        System.out.println("Könyv írója: "+book.getAuthor()+", címe: "+book.getTitle()+", reg.száma: "+book.getRegNumber());
    }
}
