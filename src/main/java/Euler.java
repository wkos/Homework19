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
}
