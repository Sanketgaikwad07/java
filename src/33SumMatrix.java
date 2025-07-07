import java.util.Scanner;


class SumMatri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the matrix addition\n ");
        System.out.print("enter the rows : ");
        int rows = sc.nextInt();
        System.out.print("enter the column: ");
        int col = sc.nextInt();
        int[][] matrix1 = new int[rows][col];
        int[][] matrix2 = new int[rows][col];
        int[][] sumMatrix = new int[rows][col];

//input for first matrix
        System.out.println("enter the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                matrix1[i][j] = sc.nextInt();

            }


        }
        System.out.println("Enter the element of second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                matrix2[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(sumMatrix[i][j] + " ");
                // matrix1[i][j]= sc.nextInt();
            }
            System.out.println();
        }

    }
}

