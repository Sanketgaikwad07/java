class swaping {


    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;  // XOR operation
        b = a ^ b;  // XOR again to swap
        a = a ^ b;  // XOR again to swap

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

