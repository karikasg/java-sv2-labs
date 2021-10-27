package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();
        System.out.println(new Book());
        Book emptyBook;
//        System.out.println(emptyBook);  hiba: not initialized
        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

// A következő kód hány objektumot hoz létre? A futás végére mennyi objektumhoz lehet hozzáférni?
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;
// 5 objektumot hoz létre, 3 objektumhoz lehet hozzáférni, egyikhez 3 változónéven (book3, book4, book5) keresztül is.

        Book[] books = {new Book(), new Book(), new Book()};
        System.out.println(Arrays.toString(books));
        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(bookList);
        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());
        System.out.println(bookList2);
    }
}
