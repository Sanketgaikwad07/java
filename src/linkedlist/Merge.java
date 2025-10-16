package linkedlist;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Merge {

    // Function to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify the logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;   // pick l1 node
                l1 = l1.next;        // move l1 ahead
            } else {
                current.next = l2;   // pick l2 node
                l2 = l2.next;        // move l2 ahead
            }
            current = current.next;  // move merged pointer
        }

        // If any list still has nodes, attach them
        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;  // merged list head
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // List1: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // List2: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        System.out.print("List1: ");
        printList(l1);

        System.out.print("List2: ");
        printList(l2);

        ListNode merged = mergeTwoLists(l1, l2);

        System.out.print("Merged: ");
        printList(merged);
    }
}


