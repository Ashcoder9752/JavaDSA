package LinkedList;

import LinkedList.MyLinkedList.Node;

import static LinkedList.IsCycle.isCycle;

public class RemoveCycle {
    private static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        // slow and fast pointer meet means there is a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            prev = fast.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                break;
            }
        }

        // if no cycle return
        if (fast == null || fast.next == null) {
            return;
        }

        // find the meeting point
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            prev = prev.next;
        }

        // remove the cycle link
        prev.next = null;
    }

    //      __________________
    //             |         |
    //             |         |
    //             -----------

    // x = distance from head to meeting node
    // y = distance from meeting node to detect cycle node (the node on which pointers meet)
    // d = no. of cycles

    // slow distance = x + (a * d) + y
    // fast distance = x + (b * d) + y

    // x + (b * d) + y = 2 * (x + (a * d) + y)
    // bd - 2ad = x + y
    // x = d(b - 2a) - y        [let (b - 2a) be a constant K]
    // x = Kd - y               [it means, x distance = some cycles - y]
    // x = (K - 1)d + (d - y)   [x distance = (some cycles - 1) + (one cycle - y)]
    // if we ignore the (some cycles - 1)
    // we get the relation
    // x = d - y

    // And, (d - y) is the distance remaining from the detect cycle node to the meeting node

    public static void main(String[] args) {
        MyLinkedList listWithCycle = new MyLinkedList();

        listWithCycle.addLast(3);
        listWithCycle.addLast(2);
        Node meetingNode = listWithCycle.tail;
        listWithCycle.addLast(0);
        listWithCycle.addLast(4);

        listWithCycle.tail.next = meetingNode;

        System.out.println(isCycle(listWithCycle.head));
        removeCycle(listWithCycle.head);
        System.out.println(isCycle(listWithCycle.head));
    }
}
