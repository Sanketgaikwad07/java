 class LinkedList {
    Node head;
    private int size;//size
    LinkedList(){
        this.size=0;
    }
     class Node {
         String data;
         Node next;

         Node(String data) {
             this.data = data;
             this.next = null;
             size++;
         }
     }

     //add first
     public void addfirst(String data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
         return;
     }

     //add-last
     public void addLast(String data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
             return;
         }
         Node currNode = head;
         while (currNode.next != null) {
             currNode = currNode.next;
         }
         currNode.next = newNode;
     }

     //print
     public void pritList() {
         if (head == null) {
             System.out.println("Empty ");
             return;
         }
             Node currNode = head;
             while (currNode != null) {
                 System.out.print(currNode.data + "->");
                 currNode = currNode.next;
             }
             System.out.println("Null");
         }
//delete
     public void delete(){
         if(head==null){
             System.out.println("is empty");
             return;
             }
         size--;
         head=head.next;
         }
         //deleteLast
     public void deleteLast(){
         if(head==null){
             System.out.println("is empty");
             return;
         }
         size--;
//         if(head.next==null){
//             head=null;
//             return;
       //  }
         Node secondLast=head;
         Node lastNode=head.next;
         while (lastNode.next!=null){
             lastNode=lastNode.next;
             secondLast=secondLast.next;
         }
         secondLast.next=null;
     }
public int getSize(){
        return size;
}
         public static void main (String[]args){
             LinkedList list = new LinkedList();
             list.addfirst("a");
             list.addfirst("is");
             list.pritList();
             list.addLast("list");
             list.pritList();
             list.addfirst("this");
             list.pritList();
list.delete();
             list.deleteLast();
             list.pritList();
             list.getSize();

             System.out.println(list.getSize());
             list.addfirst("this");
             System.out.println(list.getSize());
         }
}
