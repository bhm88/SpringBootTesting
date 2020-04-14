package TestExamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplyBy() {
        Dollar dollar = new Dollar(5);
        dollar.multiplyBy(2);
        assertEquals(10, dollar.amount);
    }
}