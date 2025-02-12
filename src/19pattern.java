import java.util.Scanner;

class pattern {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome the star");
        System.out.print("please enter the rows: ");
        int rows = sc.nextInt();
        printRightHalfpyramid(rows);
        printLefthalfPyramid(rows);


    }

    public static void printLefthalfPyramid(int maxrow) {
        System.out.println("\n here the my pyramid");
        int rows = maxrow;
        while (rows > 1) {
            int i = 1;
            while (i < rows) {
                System.out.print(" *");

                i++;
            }


            System.out.println(" ");

            rows--;
        }


    }

    public static void printRightHalfpyramid(int maxrow) {
        System.out.println("\n here the my pyramid");
        int rows = maxrow;
        while (rows < maxrow) {
            System.out.println("*");
            int i = 1;
            while (i < rows) {
                System.out.print("*");
                i++;
            }
            System.out.println(" ");

            rows++;

        }
    }


}

