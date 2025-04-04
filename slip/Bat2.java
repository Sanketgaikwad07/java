public class Bat2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try {
            System.in.read(); // Waits for user to press a key
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
