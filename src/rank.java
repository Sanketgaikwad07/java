import java.util.Scanner;

public class rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 1; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // %s -> String (left aligned in 15 spaces)
            // %03d -> Integer (zero-padded to 3 digits)
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
    }
}
