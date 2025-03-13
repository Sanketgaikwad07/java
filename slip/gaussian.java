import java.util.Scanner;

public class GaussianElimination {

    // Function to perform Gaussian Elimination
    public static void gaussianElimination(double[][] matrix, double[] result) {
        int n = result.length;

        // Forward elimination
        for (int i = 0; i < n; i++) {
            // Search for maximum in this column
            double max = Math.abs(matrix[i][i]);
            int row = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matrix[k][i]) > max) {
                    max = Math.abs(matrix[k][i]);
                    row = k;
                }
            }

            // Swap maximum row with current row
            double[] temp = matrix[i];
            matrix[i] = matrix[row];
            matrix[row] = temp;

            double tempResult = result[i];
            result[i] = result[row];
            result[row] = tempResult;

            // Make the elements below the pivot elements zero
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                result[j] -= factor * result[i];
                for (int k = i; k < n; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        // Back substitution
        double[] solution = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            solution[i] = result[i];
            for (int j = i + 1; j < n; j++) {
                solution[i] -= matrix[i][j] * solution[j];
            }
            solution[i] /= matrix[i][i];
        }

        // Print the solution
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the matrix (number of variables)
        System.out.print("Enter the number of variables (n): ");
        int n = sc.nextInt();

        // Create the augmented matrix
        double[][] matrix = new double[n][n];
        double[] result = new double[n];

        // Input matrix coefficients
        System.out.println("Enter the coefficients of the matrix (n x n):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Input the results (right-hand side)
        System.out.println("Enter the result vector:");
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextDouble();
        }

        // Solve the system of equations using Gaussian Elimination
        gaussianElimination(matrix, result);
        
        sc.close();
    }
}
