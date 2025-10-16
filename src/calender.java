public class calender {
    public static void main(String[] args) {
        // Array of all months
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        System.out.println("All Months of the Year:");
        for (int i = 0; i < months.length; i++) {
            System.out.println((i + 1) + ". " + months[i]);
        }
    }
}
