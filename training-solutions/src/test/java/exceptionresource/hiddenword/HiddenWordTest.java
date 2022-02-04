package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.awt.desktop.AppHiddenEvent;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    @Test
    void getHiddenWord() {
        HiddenWord hiddenWord = new HiddenWord();
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(Path.of("training-solutions/src/test/resources/hiddenword.txt")));
    }
}