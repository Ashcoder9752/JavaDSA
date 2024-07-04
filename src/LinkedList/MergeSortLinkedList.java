package LinkedList;

import LinkedList.MyLinkedList.Node;

public class MergeSortLinkedList {
    private static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // get middle
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node middle = slow.next;
        slow.next = null;

        // divide
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(middle);

        // conquer
        return merge(newLeft, newRight);
    }

    private static Node merge(Node head1, Node head2) {
        Node prev = new Node();
        Node curr = prev;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                prev.next = head1;
                head1 = head1.next;
            } else {
                prev.next = head2;
                head2 = head2.next;
            }
            prev = prev.next;
        }
        while (head1 != null) {
            prev.next = head1;
            head1 = head1.next;
            prev = prev.next;
        }
        while (head2 != null) {
            prev.next = head2;
            head2 = head2.next;
            prev = prev.next;
        }
        prev.next = null;

        return curr.next;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(5);
        linkedList.addLast(3);
        linkedList.addLast(9);
        linkedList.addLast(11);
        linkedList.addLast(8);

        linkedList.print();

        linkedList.head = mergeSort(linkedList.head);

        linkedList.print();
    }
}
