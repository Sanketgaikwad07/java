import java.util.Scanner;

 class odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
        String[] res={"Even","odd"};
        System.out.println(res[n %2]);
    }
}
