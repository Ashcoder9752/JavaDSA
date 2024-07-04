package LinkedList;

import LinkedList.MyLinkedList.Node;

//        You are given the head of a singly linked-list. The list can be represented as:
//
//        L0 → L1 → … → Ln - 1 → Ln
//
//        Reorder the list to be on the following form:
//        L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//        You may not modify the values in the list's nodes. Only nodes themselves may be changed.
//
//
//        Example 1:
//        Input: head = [1,2,3,4]
//        Output: [1,4,2,3]
//
//        Example 2:
//        Input: head = [1,2,3,4,5]
//        Output: [1,5,2,4,3]
//
//        Constraints:
//              The number of nodes in the list is in the range [1, 5 * 10^4].
//              1 <= Node.val <= 1000

public class ZigZagList {
    private static void zigZag(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        // get mid
        Node middle = getMid(head);

        // reverse second half
        Node rightHead = reverseSecondHalf(middle.next);
        middle.next = null;

        // merge them zig-zag
        mergeZigZag(head, rightHead);
    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node reverseSecondHalf(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static void mergeZigZag(Node left, Node right) {
        while (left != null && right != null) {
            Node nextLeft = left.next;
            Node nextRight = right.next;
            left.next = right;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.print();
        zigZag(list.head);
        list.print();
    }
}
