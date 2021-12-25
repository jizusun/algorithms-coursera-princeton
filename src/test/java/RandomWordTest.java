import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomWordTest {

    RandomWord r;

    @BeforeEach
    void setUp() {
        String[] names = {"Kevin", "Bob"};
        r = new RandomWord();
    }

    @Test
    void getSurvivingChampionAlways() {
        int i = 0;
        String actual = r.getSurvivingChampion("", "tails", ++i);
        String expected = "tails";
        assertEquals(expected, actual);
    }
    @Test
    void getSurvivingChampionHalf() {
        int i = 1;
        String actual = r.getSurvivingChampion("prev", "tails", ++i);
        assertNotEquals("", actual);
    }
    @Test
    void getSurvivingChampionNever() {
        String actual = RandomWord.getSurvivingChampion("heads", "tails", 0);
        String expected = "heads";
        assertEquals(expected, actual);
    }
}