import java.util.Scanner;

public class LoopThreeFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 3 or 4 to run the loop that many times: ");
        int loopCount = scanner.nextInt();
        
        // Check if input is 3 or 4
        if (loopCount == 3 || loopCount == 4) {
            for (int i = 1; i <= loopCount; i++) {
                System.out.println("This is iteration number: " + i);
            }
        } else {
            System.out.println("Please enter only 3 or 4.");
        }
        
        scanner.close();
    }
}
