import java.util.Scanner;

class twoDDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 2D array
        int[][] array = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // Get the number to search
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Search the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Number found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        scanner.close();
    }
}
