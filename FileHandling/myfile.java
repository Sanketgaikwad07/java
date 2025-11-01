import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class error {
    
    public static void main(String[] args) {
        try {
            File myfil = new File("homey.js");
            if (myfil.createNewFile()) {
                myfil.wait(120);
                System.out.println("myfille" + myfil);
            } else {
                System.out.println("not create ");
            }
        } catch (IOException e) {
            System.out.println("not done");
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
