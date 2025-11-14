import java.util.Scanner;

 class fact {
    public static void factorial(int n){
        //condition
        if( n<0){
            System.out.println("invlid number");
            return;
        }
        int fact=1;
        //loop
        for(int i=n;i>=1;i--){
            fact= fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
}
