package DS;

import java.util.Scanner;

public class sum_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        System.out.print("Enter  " + a + " number: ");
        int arr[]=new int[a];
     //   System.out.println("Enter the second number:");
        for(int i=0;i<a;i++) {

            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=arr[i];


        }
        System.out.println("Sum of the array : "+sum);
    }
}
