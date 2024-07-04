package LinkedList;

import LinkedList.MyLinkedList.Node;

//        Given head, the head of a linked list, determine if the linked list has a cycle in it.
//        There is a cycle in a linked list if there is some node in the list that can be reached again by
//        continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's
//        next pointer is connected to. Note that pos is not passed as a parameter.
//
//        Return true if there is a cycle in the linked list. Otherwise, return false.
//
//
//        Example 1:
//        Input: head = [3,2,0,-4], pos = 1
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//
//        Example 2:
//        Input: head = [1,2], pos = 0
//        Output: true
//        Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
//
//        Example 3:
//        Input: head = [1], pos = -1
//        Output: false
//        Explanation: There is no cycle in the linked list.
//
//
//        Constraints:
//              The number of the nodes in the list is in the range [0, 10^4].
//              -10^5 <= Node.val <= 10^5
//              pos is -1 or a valid index in the linked-list.


public class IsCycle {
    static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // FLOYD'S CYCLE FINDING ALGORITHM

    // let's say the cycle is of length (d)
    // let's calculate the distance between slow and fast pointer
    // move 1       distance 1
    // move 2       distance 2
    // move 3       distance 3
    // move 4       distance 4
    // ...
    // ...
    // move d       distance d
    // move 2d      distance 2d
    // ...
    // move nd      distance nd

    // distance is a multiple of d means fast pointer is d distance ahead of slow pointer
    // if at that time slow pointer is in the cycle fast pointer will be n-cycles ahead
    // d distance ahead (at the same point)

    // or in other words
    // once the slow pointer has entered the cycle the distance between slow and fast starts
    // to decrease by 1 node every move (looking from fast's view)
    // it will definitely become 0 sometime (THEY'LL MEET)

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);

        System.out.println(isCycle(list.head));

        MyLinkedList listWithCycle = new MyLinkedList();

        listWithCycle.addLast(3);
        listWithCycle.addLast(2);
        Node meetingNode = listWithCycle.tail;
        listWithCycle.addLast(0);
        listWithCycle.addLast(4);

        listWithCycle.tail.next = meetingNode;

        System.out.println(isCycle(listWithCycle.head));
    }
}
