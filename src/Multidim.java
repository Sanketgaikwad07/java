public class Multidim {
        public static int[][] convert1DTo2D(int[] original, int m, int n) {
            if (original.length != m * n) {
                // Return an empty array or throw an exception if dimensions don't match
                return new int[0][0];
            }

            int[][] result = new int[m][n];
            int k = 0; // Index for the 1D array

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = original[k];
                    k++;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] oneDArray = {1, 2, 3, 4, 5, 6};
            int rows = 2;
            int cols = 3;

            int[][] twoDArray = convert1DTo2D(oneDArray, rows, cols);

            // Print the 2D array for verification
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.print(twoDArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

