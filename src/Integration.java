import java.util.Scanner;

class IntegrationSimpson38 {

    // Example function f(x) = x^3 (you can change this function)
    static double f(double x) {
        return x * x*x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter lower limit a: ");
        double a = sc.nextDouble();

        System.out.print("Enter upper limit b: ");
        double b = sc.nextDouble();

        System.out.print("Enter number of intervals n (multiple of 3): ");
        int n = sc.nextInt();

        // Check condition
        if (n % 3 != 0) {
            System.out.println("Error: n must be a multiple of 3 for Simpson’s 3/8 rule.");
            return;
        }

        // Step size
        double h = (b - a) / n;

        // Apply Simpson’s 3/8 Rule
        double result = f(a) + f(b);

        // Summation
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 3 == 0) {
                result += 2 * f(x);
            } else {
                result += 3 * f(x);
            }
        }

        result = (3 * h / 8) * result;

        // Output
        System.out.println("Approximate integral = " + result);

      
    }
}
