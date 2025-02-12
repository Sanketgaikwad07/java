import java.util.Scanner;

class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the your number:  ");


        int first = sc.nextInt();
        boolean isPrime = isPrime(first);
        if (isPrime) {
            System.out.println("your number is prime");

        } else {
            System.out.println("your number is not prime");

        }


    }

    public static boolean isPrime(int first) {

        int i = 2;
        while (i < first) {
            if (first % i == 0) {
                return false;

            }
            i++;
        }


        return true;
    }

}
