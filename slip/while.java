import java.util.Scanner;

class DoWhile {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age=sc.nextInt();
//         while(age<0|| age>100 ){
//             System.out.println("Enter your age: ");
//              age=sc.nextInt();
//         }
        int age;
        do {
            System.out.println("Enter your age: ");
            age = sc.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Enter your age: "+age);

    }

}
        // System.out.print("your age is : "+age );




