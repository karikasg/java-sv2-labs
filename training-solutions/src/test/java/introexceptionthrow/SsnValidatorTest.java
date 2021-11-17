package introexceptionthrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SsnValidatorTest {

    @Test
    void testSsnValidator() {
        SsnValidator ssnValidator = new SsnValidator();
        assertEquals(true, ssnValidator.isValidSsn("028185798"));
        assertEquals(true, ssnValidator.isValidSsn("105368027"));
        assertEquals(true, ssnValidator.isValidSsn("077277334"));
        assertEquals(false, ssnValidator.isValidSsn("123456789"));
        assertEquals(false, ssnValidator.isValidSsn("987654321"));
    }
}