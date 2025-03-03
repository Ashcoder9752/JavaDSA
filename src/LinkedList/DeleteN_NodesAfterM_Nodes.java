package LinkedList;

import LinkedList.MyLinkedList.Node;

//        Given a linked list, delete N nodes after skipping M nodes of a linked list until the last of the linked list.
//        Example:
//        Input:
//                2
//                8
//                2 1
//                9 1 3 5 9 4 10 1
//                6
//                6 1
//                1 2 3 4 5 6
//
//        Output:
//                9 1 5 9 10 1
//                1 2 3 4 5 6
//
//        Explanation:
//        Deleting one node after skipping the M nodes each time, we have list as 9-> 1-> 5-> 9-> 10-> 1.

//        Input:
//        The first line of input contains the number of test cases T. For each test case, the first line of input contains a number of elements in the linked list, and the next M and N respectively space-separated. The last line contains the elements of the linked list.
//
//        Output:
//        The function should not print any output to the stdin/console.
//
//        Your Task:
//        The task is to complete the function linkDelete() which should modify the linked list as required.
//
//        Constraints:
//
//                1 <= size of linked list <= 1000
//                0 < M <= size of linked list
//                0 <= N <= size of linked list

public class DeleteN_NodesAfterM_Nodes {
    private static void linkDelete(Node head, int M, int N) {
        Node curr = head, t;

        while (curr != null) {
            for(int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) {
                return;
            }
            t = curr.next;
            for (int i = 0; i < N && t != null; i++) {
                t = t.next;
            }
            curr.next = t;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(9);
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);
        list.addLast(9);
        list.addLast(4);
        list.addLast(10);
        list.addLast(1);

        linkDelete(list.head, 2, 1);

        list.print();
    }
}
