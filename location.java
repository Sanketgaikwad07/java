public class MemoryLocationExample {
    public static void main(String[] args) {
        Object myObject = new Object();
        
        // Get the identity hash code (not a real memory address, but a unique identifier)
        int hashCode = System.identityHashCode(myObject);
        
        // Print the hash code
        System.out.println("Identity Hash Code (as a unique identifier): " + hashCode);
        
        // Example of using the object in an array
        String myString = "Hello, World!";
        System.out.println("String: " + myString);
        System.out.println("Identity Hash Code of String: " + System.identityHashCode(myString));
    }
}
