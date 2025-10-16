package linkedlist;

public class Reverse {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7, 3, 1, 134, 21, 34, 50};
     reverselistt(a);
        System.out.print("The Rverse the number is: " );
       for(int num:a){
           System.out.print( num+" ");
       }
        System.out.println( );
    }

    // Reverse array in place
static void  reverselistt(int [] arr){


    int i=0;
    int n=arr.length-1;
    while(i<n){
        int T=arr[i];
        int j=0;
         int y=arr[j];
        arr[i]=arr[n];
        arr[n]=T;
        i++;
        n--;
        y++;
        System.out.println(y);
    }

    }
}
