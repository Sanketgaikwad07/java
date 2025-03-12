public class MergeNumbers {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 456;

        // Convert both numbers to strings
        String mergedString = String.valueOf(num1) + String.valueOf(num2);
        
        // Convert the merged string back to an integer
        int mergedNumber = Integer.parseInt(mergedString);
        
        System.out.println("Merged Number: " + mergedNumber);
    }
}
