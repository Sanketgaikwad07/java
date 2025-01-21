import java.util.Scanner;

class logical {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.print("please enter your age: ");
        int age=sc.nextInt();
        System.out.println("are you female? (yes/no)");
        boolean isFemale=sc.hasNextBoolean();

        if(age<5) {
            System.out.println("you got 75% discount");
        } else if(isFemale) {
            System.out.println("you got 50% discount");
        }else if(age>60 && !isFemale) {
            System.out.println("you got 25% discount");
        }else{
            System.out.println("you got no discount");
        }
    }


}
