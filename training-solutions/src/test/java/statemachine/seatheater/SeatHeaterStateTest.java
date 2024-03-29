package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeatHeaterStateTest {

    @Test
    void testNext() {

        assertEquals(SeatHeaterState.THREE, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.TWOO, SeatHeaterState.THREE.next());
        assertEquals(SeatHeaterState.ONE, SeatHeaterState.TWOO.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.ONE.next());
    }
}
