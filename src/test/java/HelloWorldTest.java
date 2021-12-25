import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void getHelloWorld() {
        HelloWorld hg = new HelloWorld();
        Assertions.assertEquals("Hello, World", hg.getHelloWorld());
    }
}