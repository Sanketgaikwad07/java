 class SmallestDivisor {

    public static int findSmallestDivisor(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Input number must be greater than 1.");
        }


        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {

                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int number1 = 10;
        System.out.println("Smallest divisor of " + number1 + " greater than 1: " + findSmallestDivisor(number1)); // Output: 2

        int number2 = 7;
        System.out.println("Smallest divisor of " + number2 + " greater than 1: " + findSmallestDivisor(number2)); // Output: 7

        int number3 = 12;
        System.out.println("Smallest divisor of " + number3 + " greater than 1: " + findSmallestDivisor(number3)); // Output: 2
    }
}