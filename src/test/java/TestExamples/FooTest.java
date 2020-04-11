package TestExamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {


    @Test
    public void getBarTest() {
        Foo foo = new Foo();
        String result = foo.bar();
        assertEquals("FooBar", result);


    }

    @Test
    public void getBarTest_returnsFailure() {
        Foo foo = new Foo();
        String result = foo.bar();
        assertNotEquals("FoovcBar", result);


    }

}