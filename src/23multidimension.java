class multidimension {


    public static void main(String[] args) {
        // Initialize a 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {4, 4, 4}
        };

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();// Move to the next row
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("\nSum of all elements: " + sum);
    }

}


