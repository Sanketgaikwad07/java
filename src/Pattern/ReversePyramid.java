package Pattern;

public class ReversePyramid {
    static void reverse(int n){
        for(int i=n;i>=1;i--){//outer loop

            for(int j=0;j<=i;j++){//inner loop
    System.out.print(j+" ");
}
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=10;
        reverse(n);
    }
}
