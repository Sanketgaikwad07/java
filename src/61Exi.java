import java.util.Scanner;

class Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command = sc.next();
            if (command.equalsIgnoreCase("Enter")) {
                break;
            }
        }
        // System.out.print("Enter your number: ");
        System.out.println("You have successfully open...");
    }


}
