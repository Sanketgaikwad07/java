import java.util.Scanner;

class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the diagonal element\n");
        System.out.print("Enter the matrix: ");
        int num = sc.nextInt();
        // System.out.println("Enter the scond element: ");
        // int num2= sc.nextInt();
        int[][] matrix = new int[num][num];
        System.out.println("Enter the marix: ");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int primarySum = 0, scondarySum = 0;
        for (int i = 0; i < num; i++) {
            primarySum += matrix[i][i];//primary diagonal
            scondarySum += matrix[i][num - 1 - i];//secondary diagonal
        }
        if (num % 1 != 0) {
            scondarySum -= matrix[num / 2][num / 2];
        }
        int totalSum = primarySum + scondarySum;
//output the program
        System.out.println("sum of primary diagonal: " + primarySum);
        System.out.println("sum of secondary diagonal: " + scondarySum);
        System.out.println("Total sum of diagonal is: " + totalSum);
    }


}
//————ˍˍˍˍˍ———ˍˍˍ———ˍˍˍˍˍ————ˍˍˍˍ———ˍˍˍˍˍˍˍˍˍˍ—————————