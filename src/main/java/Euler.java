import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class Euler {
    public static boolean multipleOfThreeOrFive(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

    public static long sumOfMultiplesOfThreeOrFive(int number) {
        long sum = 0;
        for (int i = 3; i < number; i++) {
            if (multipleOfThreeOrFive(i))
                sum += i;
        }
        return sum;
    }

    public static long sumOfMultiplesOfThreeOrFiveOnStream(int number) {
        return iterate(3, n -> n + 1)
                .limit(number - 3)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToLong(Integer::intValue)
                .sum();
    }
}
