package LinkedList;

import LinkedList.MyLinkedList.Node;

//        We have a linked list and two keys in it, swap nodes for two given keys.Nodes should be swapped by changing
//        links.Swapping data of nodes may be expensive in many situations when data contains many fields. It may be
//        assumed that all keys in the linked list are distinct.
//
//        Sample Input 1: 1->2->3->4,  x = 2, y = 4
//        Sample Output 1: 1->4->3->2

public class SwapTwoNodes {
    private static Node swapNodes(Node head, int x, int y) {
        // if list is empty or have same node for x and y
        if (head == null || x == y) {
            return head;
        }

        // find first node and its prev
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // find second node and its prev
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // if either node is null means no swap can be performed
        if (currX == null || currY == null) {
            return head;
        }

        // if currX sits at head then make currY head otherwise prevX.next = currY
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        // if currY sits at head then make currX head otherwise prevY.next = currX
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // swap other links
        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;

        return head;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.head = swapNodes(list.head, 2, 4);

        System.out.println(list);
    }
}
