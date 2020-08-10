import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;

public class EulerTest {
    @Test
    void shoudReturnTwentyThreeWhenTen() {
        //given
        int testNumber = 10;
        long shoudReturn = 23;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        Assertions.assertEquals(result, shoudReturn);
    }

    @Test
    void shouldReturnThirtyThreeWhenEleven() {
        //given
        int testNumber = 11;
        long shouldReturn = 33;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        Assertions.assertEquals(result, shouldReturn);
    }

    @Test
    void shouldReturnThirtyThreeWhenTwelve() {
        //given
        int testNumber = 12;
        long shouldReturn = 33;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        Assertions.assertEquals(result, shouldReturn);
    }

    @Test
    void shouldReturnFortyFiveWhenThirteen() {
        //given
        int testNumber = 13;
        long shouldReturn = 45;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        assertThat(result, is(shouldReturn));
    }

    @Test
    void shouldReturnSixtywhenSixteen() {
        //given
        int testNumber = 16;
        long shouldReturn = 60;

        //then
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        assertThat(result, is(shouldReturn));
    }
}
