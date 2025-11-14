import java.util.Scanner;

public class linkdin {

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int sum = 0;
        for(int i=0;i<=100;i++) {

            sum += i;
        }
            System.out.println(sum);
        }
    }
