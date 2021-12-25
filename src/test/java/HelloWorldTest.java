import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void GetCorrectText() {
        Assertions.assertEquals("Hello, World", HelloWorld.getHelloWorld());
    }

}