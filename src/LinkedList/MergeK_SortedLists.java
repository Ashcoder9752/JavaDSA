package LinkedList;

import LinkedList.MyLinkedList.Node;

//        You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//        Merge all the linked-lists into one sorted linked-list and return it.
//
//        Example 1:
//
//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//        Output: [1,1,2,3,4,4,5,6]
//        Explanation: The linked-lists are:
//            [
//                1->4->5,
//                1->3->4,
//                2->6
//            ]
//        merging them into one sorted list:
//                1->1->2->3->4->4->5->6
//
//        Example 2:
//
//        Input: lists = []
//        Output: []
//        Example 3:
//
//        Input: lists = [[]]
//        Output: []
//
//
//        Constraints:
//              k == lists.length
//              0 <= k <= 10^4
//              0 <= lists[i].length <= 500
//              -10^4 <= lists[i][j] <= 10^4
//              lists[i] is sorted in ascending order.
//              The sum of lists[i].length will not exceed 104.

public class MergeK_SortedLists {
    private static Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        return mergeKLists(lists, 0, lists.length - 1);
    }

    private static Node mergeKLists(Node[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int mid = start + (end - start) / 2;
        Node left = mergeKLists(lists, start, mid);
        Node right = mergeKLists(lists, mid + 1, end);

        return merge(left, right);
    }

    private static Node merge(Node left, Node right) {
        Node head = new Node();
        Node curr = head;

        while (left != null && right != null) {
            if (left.data < right.data) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        while (left != null) {
            curr.next = left;
            left = left.next;
            curr = curr.next;
        }
        while (right != null) {
            curr.next = right;
            right = right.next;
            curr = curr.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(4);
        list1.addLast(5);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        MyLinkedList list3 = new MyLinkedList();
        list3.addLast(2);
        list3.addLast(6);

        Node[] lists = new Node[3];
        lists[0] = list1.head;
        lists[1] = list2.head;
        lists[2] = list3.head;

        MyLinkedList mergedList = new MyLinkedList();
        mergedList.head = mergeKLists(lists);
        mergedList.print();
    }
}
