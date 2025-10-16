package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        int[] digit={9,0,0,4};
        System.out.println(Arrays.toString(PulseOne(digit)));
    }
    static int[] PulseOne(int[] digit)
    {
        int n=digit.length;
        for(int i=n-1;i>=0;i--){
            if(digit[i]<9){
                digit[i]++;
                return digit;
            }
            digit[1]=0;
        }
        int[] NewNumbwer=new int[n+1];//create a new number 9+1=1,0
        NewNumbwer[0]=1;
        return NewNumbwer;
    }

    public static class branch {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();

        }
    }
}
