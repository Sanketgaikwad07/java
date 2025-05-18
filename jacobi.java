public class JacobiMethod {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {
            {10, 2, 0},
            {-3, -6, 2},
            {1, 1, 5}
        };
        double[] b = {9, -16, 15};
        double[] x = {0, 0, 0}; // Initial guess
        double[] xNew = new double[n];

        int maxIterations = 25;
        double tolerance = 1e-6;

        for (int iter = 0; iter < maxIterations; iter++) {
            for (int i = 0; i < n; i++) {
                double sum = b[i];
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum -= A[i][j] * x[j];
                    }
                }
                xNew[i] = sum / A[i][i];
            }

            // Check for convergence
            double error = 0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNew[i] - x[i]));
                x[i] = xNew[i];
            }

            if (error < tolerance) break;
        }

        System.out.println("Solution using Jacobi Method:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.6f\n", i + 1, x[i]);
        }
    }
}
