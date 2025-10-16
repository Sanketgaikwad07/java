import java.util.Scanner;

abstract class book {
    void read() {
        System.out.println("i will done two book: ");
    }
}
    class Adder extends book {

    }

    class Abstract {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
book A=new Adder();
            A.read();
            System.out.println();

        }

    }

//import java.util.Scanner;
//
//// Abstract class
//abstract class Book {
//    void read() {
//        System.out.println("I have read two books.");
//    }
//}

//// Concrete subclass
//class Adder extends Book {
//    // No need to override read() unless you want custom behavior
//}
//
//// Main class
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Create object using subclass
//        Book bookObj = new Adder();
//        bookObj.read();
//    }
//}
