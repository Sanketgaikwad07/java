import java.util.Scanner;

 class multipleFun {
    public static int cal(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=cal(a,b);
        System.out.print("the multiple of 2 number is: "+sum);
    }
}
