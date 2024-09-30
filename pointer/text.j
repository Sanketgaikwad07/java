public class TextScrolling {
    public static void main(String[] args) throws InterruptedException {
        String text = "This is a scrolling text. ";
        int width = 20; 

        while (true) {
            for (int i = 0; i < width; i++) {
                clearScreen();
                System.out.print(text.substring(i) + text.substring(0, i));
                Thread.sleep(200); /
            }
        }
    }


    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
