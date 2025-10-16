package Pattern;

public class TriangleNum {

    static void pattren(int n) {
        for (int i = 1; i <=n; i++) {//handle the number of rows

            for(int j=1;j<=n-i;j++){//print space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//print the number
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {//recursive function
        int n=5;
        pattren(n);

    }
}
