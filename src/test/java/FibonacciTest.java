import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FibonacciTest {

    @Test
    public void shouldReturnZeroWhenOne() {
        //given
        int testNumber = 1;

        //when
        long result = Fibonacci.sumOfEvenFibonacci(testNumber);

        //then
        long shouldReturn = 0;
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTwoWhenThree() {
        //given
        int testNumber = 3;

        //when
        long result = Fibonacci.sumOfEvenFibonacci(testNumber);

        //then
        long shouldReturn = 2;
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTwoWhenSeven() {
        //given
        int testNumber = 7;

        //when
        long result = Fibonacci.sumOfEvenFibonacci(testNumber);

        //then
        long shouldReturn = 2;
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTenWhenEight() {
        //given
        int testNumber = 8;

        //when
        long result = Fibonacci.sumOfEvenFibonacci(testNumber);

        //then
        long shouldReturn = 10;
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTenWhenFifteen() {
        //given
        int testNumber = 15;

        //when
        long result = Fibonacci.sumOfEvenFibonacci(testNumber);

        //then
        long shouldReturn = 10;
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnOneHundredAndEightyEightWhenOneHundredAndfifty() {
        //given
        int testNumber = 150;

        //when
        long result = Fibonacci.sumOfEvenFibonacci(testNumber);

        //then
        long shouldReturn = 188;
        assertThat(result, is(shouldReturn));
    }
}
