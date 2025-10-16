import java.io.File;
import java.io.IOException;

 class FileHandling {
    public static void main(String[] args) throws IOException {
        try {
            File myfile = new File("csk.java");
            if (myfile.createNewFile()) {
                System.out.println("create my file " + myfile);
            } else {
                System.out.print("file does't exit");
            }

        } catch (IOException e){
    }
}
}