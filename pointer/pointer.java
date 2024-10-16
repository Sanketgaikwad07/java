public class PointerExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Print original values
        System.out.println("Original values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Simulate pointer behavior
        int[] ref = {a};  // reference-like behavior
        ref[0] = b;       // change the value via the reference

        // Print modified values
        System.out.println("After modifying through reference:");
        System.out.println("a = " + ref[0]); // a is now 20
    }
}
