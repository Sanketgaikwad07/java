import java.io.File;

class Fild {
    public static void main(String[] args) {
        try{
            File file=new File("my.css");
            if(file.createNewFile())
            System.out.println(file);
        }catch (Exception e){
            System.out.println("My File");
        }

    }
}
