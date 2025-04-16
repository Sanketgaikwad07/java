import java.util.Scanner;

//import java.util.Scanner;
//
//class passwordChecker {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("welcome to the password\n");
//         String password;
//         do{
//             System.out.print("Enter your password: ");
//             password= String.valueOf((sc.nextInt()));
//         }while (!isvalidpassword(password));
//
//     }
//     public static boolean isvalidpassword(String password){
//         return password.length()>6;
//     }
//}
class passwordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome \n");
        String password;
        do {

            System.out.print("Enter your password: ");
            password = sc.next();
        } while (!isValidPassword(password));
        System.out.println("Thank You");

    }

    public static boolean isValidPassword(String password) {


        return password.contains("sanket");

    }
}
