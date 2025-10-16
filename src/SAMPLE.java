import java.util.Scanner;

public class SAMPLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Number is even");
        } else {
            // if (n % 2 != 0) {
            System.out.println("Number is odd");
            //   }
        }
        boolean isprime = prime(n);
        if (isprime) {
            System.out.println(n + " Is a prime number ");


        } else {
            System.out.println(n +"  Is a not prime number");
        }
    }

        static boolean prime( int n){
            if (n <=1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }

            }
            return true;

        }
    }










