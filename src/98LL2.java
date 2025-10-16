import java.util.LinkedList;

 class LL2 {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();

        list.addFirst("9");
        list.addFirst("3");
        list.addLast("4");
list.addAll(list);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
//            if(list.get(i)==value){
//                System.out.println();
//            }
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");
//        list.removeFirst();
//        System.out.println(list.remove());
//        list.removeLast();
//        System.out.println(list);
        list.remove(5);

        System.out.println(list);

        System.out.println(list.remove());
    }
}
