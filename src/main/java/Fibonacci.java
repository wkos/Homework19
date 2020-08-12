public class Fibonacci {
//    public static boolean isEven(int number) {
//        return number % 2 == 0;
//    }
//
//    public static long sumOfEvenFibonacci(int maxElementOfFibonacci) {
//        if (maxElementOfFibonacci < 2) return 0;
//        int secondLastElement;
//        int lastElement = 1;
//        int currentElement = 2;
//        long sumOfEvenElements = 0;
//        while (currentElement <= maxElementOfFibonacci) {
//            if (isEven(currentElement)) sumOfEvenElements += currentElement;
//            secondLastElement = lastElement;
//            lastElement = currentElement;
//            currentElement = secondLastElement + lastElement;
//        }
//        return sumOfEvenElements;
//    }

    public static long sumOfEvenFibonacci(int maxElementOfFibonacci) {
        if (maxElementOfFibonacci < 2) return 0;
        int secondLastElement;
        int lastElement = 1;
        int currentElement = 2;
        long sumOfEvenElements = 0;
        while (currentElement <= maxElementOfFibonacci) {
            sumOfEvenElements += currentElement;
            for (int i = 0; i < 3; i++) {
                secondLastElement = lastElement;
                lastElement = currentElement;
                currentElement = secondLastElement + lastElement;
            }
        }
        return sumOfEvenElements;
    }
}
