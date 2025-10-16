
import java.util.*;
class ArrayLis {
   static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add element
        list.add(0);
        list.add(4);
        list.add(2);
        System.out.println(list);

        int element=list.set(1,3);
        System.out.println(element);

         list.add(2,4);
        System.out.println(list);
        //set element
        list.set(0,5);
        System.out.println(list);
//remove the element
        list.remove(2);
        System.out.println(list);
    //size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
