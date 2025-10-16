package linkedlist;

class LinkedList {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return ;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Recursive function to delete a node by key
    public Node deleteRecursively(Node head, int key) {
        // Base case: empty list
        if (head == null) return null;

        // If the node to be deleted is the head
        if (head.data == key) {
            return head.next;
        }  {

        }

        // Recurse for the rest of the list
        head.next = deleteRecursively(head.next, key);
        return head;
    }

    // Wrapper function
    public void delete(int key) {
        head = deleteRecursively(head, key);
    }

    // Print the linked list
    public void printList() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(20);
if(list==null){
    System.out.println("it's a bug");
}
        System.out.println("Original list:");
       list.printList();

        list.delete(10); // deletes the first occurrence of 20
        System.out.println("After deleting 20:");
        list.printList();
    }
}
