import java.util.Arrays;
import java.util.Scanner;

 class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array" );
        int n=sc.nextInt();
int[]arr=new int[n];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)+" ");
    }
}
