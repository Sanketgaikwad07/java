package OTP;
import java.util.concurrent.ThreadLocalRandom;

public class OtpGeneratorThreadLocal {
    public static String generate4DigitOtp() {
        int number = ThreadLocalRandom.current().nextInt(10_000);
        return String.format("%04d", number);
    }

    public static void main(String[] args) {
        System.out.println("ThreadLocal OTP: " + generate4DigitOtp());
    }
}
