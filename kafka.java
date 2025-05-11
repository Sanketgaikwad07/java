 class lib {


         public static void main(String[] args) {
             int number = 25;

             // Convert integer to binary string
             String binary = Integer.toBinaryString(number);
             System.out.println("Decimal: " + number);
             System.out.println("Binary : " + binary);

             // Convert binary string back to integer
             int decimal = Integer.parseInt(binary, 2);
             System.out.println("Converted back to Decimal: " + decimal);
         }
     }

 
