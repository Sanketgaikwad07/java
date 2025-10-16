import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class error {
    public static void main(String[] args) {
        try {
            File myfil = new File("homey.js");
            Scanner sc = new Scanner(myfil);
            while (sc.hasNextLine()) {
              int  data = sc.nextInt();
                System.out.println(data);
            }
            sc.close();


//            System.out.println("myfille" + myfil);
//            } else {
//                System.out.println("not create ");
        } catch (FileNotFoundException e) {
            System.out.println("An ouccred");
            throw new RuntimeException(e);
        }



}
}

