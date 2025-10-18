
             class MatrixMultiplication {

    public static void mulMat(int[][] m1, int[][] m2, int[][] res) {
        int r1 = m1.length;
        int c1 = m1[0].length;
        int r2 = m2.length;
        int c2 = m2[0].length;

        if (c1 != r2) {
            System.out.println("Invalid Input");
            System.exit(1);
        }

        // Perform matrix multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                res[i][j] = 0; // Initialize result cell
                for (int k = 0; k < c1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] m1 = {
                {1, 1},
                {2, 2}
        };

        int[][] m2 = {
                {1, 1},
                {2, 2}
        };

        int r1 = m1.length;
        int c2 = m2[0].length;
        int[][] res = new int[r1][c2]; // Resultant matrix

        mulMat(m1, m2, res);

        System.out.println("Multiplication of given two matrices is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}