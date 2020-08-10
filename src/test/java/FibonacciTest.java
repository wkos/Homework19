import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FibonacciTest {
    @Test
    public void shouldReturnZeroWhenOne() {
        //given
        int testNumber = 1;
        long shouldReturn = 0;

        //when
        long result = Fibonacci.sumOfFibonacci(testNumber);

        //then
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTwoWhenSeven() {
        //given
        int testNumber = 7;
        long shouldReturn = 2;

        //when
        long result = Fibonacci.sumOfFibonacci(testNumber);

        //then
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTenWhenEight() {
        //given
        int testNumber = 8;
        long shouldReturn = 10;

        //when
        long result = Fibonacci.sumOfFibonacci(testNumber);

        //then
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnTenWhenFifteen() {
        //given
        int testNumber = 15;
        long shouldReturn = 10;

        //when
        long result = Fibonacci.sumOfFibonacci(testNumber);

        //then
        assertThat(result, is(shouldReturn));
    }

    @Test
    public void shouldReturnOneHundredAndEightyEightWhenOneHundredAndfifty() {
        //given
        int testNumber = 150;
        long shouldReturn = 188;

        //when
        long result = Fibonacci.sumOfFibonacci(testNumber);
        System.out.println(Fibonacci.sumOfFibonacci(4000000));

        //then
        assertThat(result, is(shouldReturn));
    }
}
