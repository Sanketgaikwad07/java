import java.io.File;
import java.io.IOException;

public class file {

    public static void main(String[] args) {

        try {
            File myfile = new File("My.text");
            if(myfile.createNewFile()){
                System.out.println(myfile);
            }
        }catch (IOException e){

        }
    }
}