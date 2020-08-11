import static org.hamcrest.CoreMatchers.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;

public class EulerTest {

    @Test
    void shoudReturnTwentyThreeWhenTenOnStream() {
        //given
        int testNumber = 10;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFiveOnStream(testNumber);

        //then
        long shoudReturn = 23;
        assertThat(result, is(shoudReturn));
    }

    @Test
    void shoudReturnTwentyThreeWhenTen() {
        //given
        int testNumber = 10;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        long shoudReturn = 23;
        assertThat(result, is(shoudReturn));
    }

    @Test
    void shouldReturnThirtyThreeWhenEleven() {
        //given
        int testNumber = 11;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        long shouldReturn = 33;
        assertThat(result, is(shouldReturn));
    }

    @Test
    void shouldReturnThirtyThreeWhenTwelve() {
        //given
        int testNumber = 12;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        long shouldReturn = 33;
        assertThat(result, is(shouldReturn));
    }

    @Test
    void shouldReturnFortyFiveWhenThirteen() {
        //given
        int testNumber = 13;

        //when
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        long shouldReturn = 45;
        assertThat(result, is(shouldReturn));
    }

    @Test
    void shouldReturnSixtywhenSixteen() {
        //given
        int testNumber = 16;

        //then
        long result = Euler.sumOfMultiplesOfThreeOrFive(testNumber);

        //then
        long shouldReturn = 60;
        assertThat(result, is(shouldReturn));
    }
}
