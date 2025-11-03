package OTP;

import java.util.Random;

 class otp{
    private static final Random ran=new Random();
    public static String genretaeotp(){
        int number=ran.nextInt(100);
        return String.format("%04d",number);

    }

    public static void main(String[] args) {
        System.out.println("Random OTP: "+  genretaeotp());
    }
}
