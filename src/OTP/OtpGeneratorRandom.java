package OTP;
import java.util.Random;

 class OTPGenerator {
    public static String generateOTP(int length) {
        if (length <= 0) {
            return "";
        }
        String numbers = "9404561820";
        Random random = new Random();

        StringBuilder otp = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());
            otp.append(numbers.charAt(index));
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        int otpLength = 4;
        String generatedOTP = generateOTP(otpLength);

        System.out.println("Generated " + otpLength + "-digit OTP: " + generatedOTP);
    }
}