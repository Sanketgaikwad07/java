import java.util.ArrayList;

public class Lambd {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<Integer>();
        ArrayList<String>letter=new ArrayList<String>();
        letter.add("sanket");
        letter.forEach((b)->{
            System.out.println(b);
        });
        number.add(3);
        number.add(3);
        number.add(1);
        number.forEach((n)->{
            System.out.println(n);
        });
    }
}
