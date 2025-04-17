import java.util.Scanner;

public class SeriesModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt(); // Starting value, actually ignored based on your output
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
