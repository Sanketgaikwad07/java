package Question;

import java.util.HashMap;
import java.util.HashSet;

public class HashLoop {
    public static void main(String[] args) {
      HashMap<String,String>str=new HashMap<>();
        str.put("England", "London");
        str.put("india","Chaina");
        str.put("Stack","quesq");
        for(String i:str.keySet()){
            System.out.println("key: "+i+" Value: "+ str.get(i));

        }
    }
}
