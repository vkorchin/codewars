package howmuch;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarboatTest {

    @Test
    public void howmuch() {
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]",
                Carboat.howmuch(1, 100));
        assertEquals("[]",
                Carboat.howmuch(2950, 2950));
        assertEquals("[[M: 9991 B: 1427 C: 1110]]",
                Carboat.howmuch(10000, 9950));
    }
}