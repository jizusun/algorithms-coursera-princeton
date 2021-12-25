import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloGoodbyeTest {
    HelloGoodbye hg;

    @BeforeEach
    void setUp() {
        String[] names = {"Kevin", "Bob"};
        hg = new HelloGoodbye(names);
    }

    @Test
    void sayHello() {
        String expected = "Hello Kevin and Bob.";
        String actual = hg.sayHello();
        assertEquals(expected, actual);
    }

    @Test
    void sayGoodbye() {
        String expected = "Goodbye Bob and Kevin.";
        String actual = hg.sayGoodbye();
        assertEquals(expected, actual);
    }
}