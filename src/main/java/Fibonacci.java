public class Fibonacci {
//    public static boolean isEven(int number) {
//        return number % 2 == 0;
//    }
//
//    public static long sumOfEvenFibonacci(int maxElementOfFibonacci) {
//        if (maxElementOfFibonacci == 1) return 0;
//        if (maxElementOfFibonacci == 2 || maxElementOfFibonacci == 3) return 2;
//        int f1;
//        int f2 = 2;
//        int f3 = 3;
//        long sum = 2;
//        while (f3 <= maxElementOfFibonacci) {
//            if (isEven(f3)) sum += f3;
//            f1 = f2;
//            f2 = f3;
//            f3 = f1 + f2;
//        }
//        return sum;
//    }

    public static long sumOfEvenFibonacci(int maxElementOfFibonacci) {
        if (maxElementOfFibonacci < 2) return 0;
        int f1;
        int f2 = 1;
        int f3 = 2;
        long sum = 0;
        while (f3 <= maxElementOfFibonacci) {
            sum += f3;
            for (int i = 0; i < 3; i++) {
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
            }
        }
        return sum;
    }
}
