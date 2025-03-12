public class MatrixExample {

    public static void main(String[] args) {
        // Create a 2x3 matrix (2 rows and 3 columns)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Print the matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Add two matrices (same dimensions)
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int[][] result = addMatrices(matrix, matrix2);

        System.out.println("Sum of Matrices:");
        printMatrix(result);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Perform element-wise addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
        
