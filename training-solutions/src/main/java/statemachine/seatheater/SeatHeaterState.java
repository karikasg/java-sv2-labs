package statemachine.seatheater;

public enum SeatHeaterState {
    OFF {
        SeatHeaterState next() {
            return SeatHeaterState.THREE;
        }
    },

    ONE {
        SeatHeaterState next() {
            return SeatHeaterState.OFF;
        }
    },

    TWOO {
        SeatHeaterState next() {
            return SeatHeaterState.ONE;
        }
    },

    THREE {
        SeatHeaterState next() {
            return SeatHeaterState.TWOO;
        }
    };

    abstract SeatHeaterState next();
}
