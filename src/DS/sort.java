package DS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<String>str=new ArrayList<String>();
        ArrayList<Integer>str2=new ArrayList<Integer>();
        str.add("BMW");
        str.add("Volvo");
        str.add("Maruti");
        str.add("nano");

        Collections.sort(str);
        System.out.print(str);
    }
}
