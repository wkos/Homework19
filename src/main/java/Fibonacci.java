public class Fibonacci {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static long sumOfFibonacci(int maxElementOfFibonacci) {
        if (maxElementOfFibonacci == 1) return 0;
        if (maxElementOfFibonacci == 2 || maxElementOfFibonacci == 3) return 2;
        int f1;
        int f2 = 2;
        int f3 = 3;
        long sum = 2;
        while (f3 <= maxElementOfFibonacci) {
            if (isEven(f3)) sum += f3;
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return sum;
    }
}
