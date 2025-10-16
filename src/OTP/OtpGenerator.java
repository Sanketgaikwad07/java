package OTP;

import java.security.SecureRandom;

 class OtpGenerato {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static String generate4DigitOtp() {
        int number = secureRandom.nextInt(10_000); // 0 .. 9999
        return String.format("%04d", number);      // ensures leading zeros (e.g. "0073")
    }

    public static void main(String[] args) {
        System.out.println("Secure OTP: " + generate4DigitOtp());
    }
}
