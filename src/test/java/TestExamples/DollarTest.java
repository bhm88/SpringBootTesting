package TestExamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

    @Test
    void testMultiplyBy() {
        Dollar dollar = new Dollar(5);
        Dollar dollar1 = dollar.multiplyBy(2);

        assertEquals(10, dollar1.amount);
        dollar = dollar.multiplyBy(3);
        assertEquals(15, dollar.amount);
    }
}