package attributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBook {
    Book book;

    @Test
    void testSetting() {
        book = new Book("Egri csillagok");

        assertEquals("Egri csillagok", book.getTitle());
    }


}
