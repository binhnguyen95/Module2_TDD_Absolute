

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

    @Test
    @DisplayName("Testing 31/1/2018")
    void nextDayOf31_1_2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 30/4/2018")
    void nextDayOf30_4_2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";

        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, result);
    }




}