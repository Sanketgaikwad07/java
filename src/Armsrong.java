import java.lang.Math;

class ArmstrongNumbersInRange {

    public static void main(String[] args) {
        int lowerBound = 1; // Starting of the range
        int upperBound = 1000; // Ending of the range

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");

        // Outer loop to iterate through each number in the given range
        for (int number = lowerBound; number <= upperBound; number++) {
            int originalNumber = number;
            int sumOfPowers = 0;
            int numberOfDigits = 0;

            // Inner loop 1: Calculate the number of digits
            int tempNumber = originalNumber;
            while (tempNumber != 0) {
                tempNumber /= 10;
                numberOfDigits++;
            }

            // Inner loop 2: Calculate the sum of digits raised to the power of numberOfDigits
            tempNumber = originalNumber; // Reset tempNumber to the original number
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                sumOfPowers += Math.pow(digit, numberOfDigits);
                tempNumber /= 10;
            }

            // Check if the number is an Armstrong number
            if (sumOfPowers == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}