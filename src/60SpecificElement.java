import java.util.Scanner;

class SpecificElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome\n");
        int[] nums = ArrayUtilites.inputArray();
        System.out.print("Enter your number: ");
        int element = sc.nextInt();
        int occ = isOcc(nums, element);
        System.out.println("your number was found: " + occ + " times.");
    }

    public static int isOcc(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }
        }

        return occ;
    }
}
