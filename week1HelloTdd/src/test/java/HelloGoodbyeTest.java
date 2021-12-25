import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloGoodbyeTest {
    HelloGoodbye hg;

    @BeforeEach
    void setUp() {
        String[] names = {"Kevin", "Bob"};
        hg = new HelloGoodbye();
        hg.addNames(names);
    }

    @Test
    void getHello() {
        String expected = "Hello Kevin and Bob.";
        String actual = hg.getHello();
        assertEquals(expected, actual);
    }

    @Test
    void getGoodbye() {
        String expected = "Goodbye Bob and Kevin.";
        String actual = hg.getGoodbye();
        assertEquals(expected, actual);
    }
}