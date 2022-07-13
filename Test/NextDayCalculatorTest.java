

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("Testing 1/1/2018")
    void nextDayOf1_1_2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }


}