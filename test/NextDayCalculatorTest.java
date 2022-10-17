import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NextDayCalculatorTest {

    @Test
    void testAddDay0() {
        String expected = "Day: 2 Month: 1 Year: 2018";
        String result = NextDayCalculator.addDay(1,1,2018);

        assertEquals(expected, result);
    }

    @Test
    void testAddDay1() {
        String expected = "Day: 1 Month: 2 Year: 2018";
        String result = NextDayCalculator.addDay(31,1,2018);

        assertEquals(expected, result);
    }

    @Test
    void testAddDay2() {
        String expected = "Day: 1 Month: 5 Year: 2018";
        String result = NextDayCalculator.addDay(30,4,2018);

        assertEquals(expected, result);
    }

    @Test
    void testAddDay3() {
        String expected = "Day: 1 Month: 3 Year: 2018";
        String result = NextDayCalculator.addDay(28,2,2018);

        assertEquals(expected, result);
    }

    @Test
    void testAddDay4() {
        String expected = "Day: 1 Month: 3 Year: 2020";
        String result = NextDayCalculator.addDay(29,2,2020);

        assertEquals(expected, result);
    }

    @Test
    void testAddDay5() {
        String expected = "Day: 1 Month: 1 Year: 2019";
        String result = NextDayCalculator.addDay(31,12,2018);

        assertEquals(expected, result);
    }
}