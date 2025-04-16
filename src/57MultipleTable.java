import java.util.Scanner;

 class MultipleTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the multiple table\n");
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i =0;i<=10;i++){
            System.out.println(num+"x"+i +" = " + (num*i));
        }
    }
}
