import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String intput = sc.nextLine();
        String output = "";
        for (int i = intput.length() - 1; i > 0; i--) {
            output += intput.charAt(i);

        }
        System.out.println(output);
    }
    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int input=sc.nextInt();
//        int reversed=0;
//        while(input!=0) {
//            int digit = input % 10;
//            reversed = reversed * 10 + digit;
//            input = input / 10;
//        }
//        System.out.println(reversed);
//
//        }
//
//
//
//
//    }

