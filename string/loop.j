public class ForLoopExample {
    public static void main(String[] args) {
        // Print the first 10 natural numbers and their squares
        System.out.println("Number\tSquare");
        System.out.println("---------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t%d\n", i, i * i);
        }
    }
}
