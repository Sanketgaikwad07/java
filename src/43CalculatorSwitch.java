import java.util.Scanner;

class CalculatorSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation: ");
        String operation = sc.next();
        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -5;

        };
        System.out.println("Your  result is : " + result);

    }
    //public static


}
