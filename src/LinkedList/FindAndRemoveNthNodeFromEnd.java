package LinkedList;

import LinkedList.MyLinkedList.Node;

//        Given the head of a linked list, remove the nth node from the end of the list and return its head.
//        Example 1:
//        Input: head = [1,2,3,4,5], n = 2
//        Output: [1,2,3,5]
//
//        Example 2:
//        Input: head = [1], n = 1
//        Output: []
//
//        Example 3:
//        Input: head = [1,2], n = 1
//        Output: [1]
//
//        Constraints:
//        The number of nodes in the list is sz.
//              1 <= sz <= 30
//              0 <= Node.val <= 100
//              1 <= n <= sz


public class FindAndRemoveNthNodeFromEnd {
    private static Node deleteFromLast(Node head, int n) {
        Node temp = head;
        while (n-- > 0) {
            temp = temp.next;
        }
        // If temp points to null means we have to remove the first element
        // as given in the constraint 1 <= n <= size
        if (temp == null) {
            return head.next;
        }

        Node curr = head;
        while (temp.next != null) {
            temp = temp.next;
            curr = curr.next;
        }
        // the curr will finally point to n + 1 node from last
        // we'll connect this curr to curr.next.next
        // means curr.next will be deleted
        curr.next = curr.next.next;

        return head;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        int n = 3;

        list.print();
        list.head = deleteFromLast(list.head, n);
        list.print();
    }
}
