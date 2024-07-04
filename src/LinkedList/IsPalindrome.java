package LinkedList;

import LinkedList.MyLinkedList.Node;

//        Given the head of a singly linked list, return true if it is a
//        palindrome or false otherwise.
//
//        Example 1:
//        Input: head = [1,2,2,1]
//        Output: true
//
//        Example 2:
//        Input: head = [1,2]
//        Output: false
//
//        Constraints:
//        The number of nodes in the list is in the range [1, 10^5].
//                0 <= Node.val <= 9

public class IsPalindrome {
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node mid = findMiddleNode(head);

        // reverse half
        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        mid = prev;

        // check for palindrome
        Node start = head;
        while (mid != null) {
            if (start.data != mid.data) {
                return false;
            }
            start = start.next;
            mid = mid.next;
        }
        return true;
    }

    private static Node findMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);

        list.print();
        System.out.println(isPalindrome(list.head));
    }
}
