import java.util.Scanner;

class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        long fect = fact(num);
        System.out.println(" your number: " + fect);
    }

    public static long fact(int num) {
        System.out.println("function called for" + num);
        if (num == 1) {
            return 1;

        }
        return num * fact(num - 1);

    }
//public static long fact(int num){
//       long result =1;
//       for (int i=1;i<=num;i++){
//           result*=i;
//       }
//         return result;
//}
}
