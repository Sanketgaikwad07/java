import java.util.Scanner;

public class GaussianElimination {

    // Function to perform partial pivoting (row swapping)
    public static void partialPivoting(double[][] matrix, double[] result, int pivotRow, int n) {
        double max = Math.abs(matrix[pivotRow][pivotRow]);
        int maxRow = pivotRow;

        // Search for the row with the largest pivot element
        for (int i = pivotRow + 1; i < n; i++) {
            if (Math.abs(matrix[i][pivotRow]) > max) {
                max = Math.abs(matrix[i][pivotRow]);
                maxRow = i;
            }
        }

        // If maxRow is different from pivotRow, swap the rows
        if (maxRow != pivotRow) {
            double[] temp = matrix[pivotRow];
            matrix[pivotRow] = matrix[maxRow];
            matrix[maxRow] = temp;

            double tempResult = result[pivotRow];
            result[pivotRow] = result[maxRow];
            result[maxRow] = tempResult;
        }
    }

    // Function to perform Gaussian Elimination
    public static void gaussianElimination(double[][] matrix, double[] result, int n) {
        // Forward Elimination process
        for (int i = 0; i < n; i++) {
            // Partial pivoting to reduce numerical errors
            partialPivoting(matrix, result, i, n);

            // Make the elements below the pivot element zero
            for (int j = i + 1; j < n; j++) {
                if (matrix[j][i] != 0) {
                    double factor = matrix[j][i] / matrix[i][i];
                    result[j] -= factor * result[i];

                    for (int k = i; k < n; k++) {
                        matrix[j][k] -= factor * matrix[i][k];
                    }
                }
            }
        }
    }

    // Function t
