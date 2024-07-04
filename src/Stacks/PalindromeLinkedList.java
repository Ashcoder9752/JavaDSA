package Stacks;

import LinkedList.MyLinkedList;
import LinkedList.MyLinkedList.Node;

import java.util.Stack;

//        We have a singly linked list of characters, write a function that returns true if the given list is a
//        palindrome, else false.
//
//        Input : A->B->C->B->A
//        Output : Yes It is Palindrome

public class PalindromeLinkedList {
    private static boolean isPalindrome(Node head) {
        Stack<Node> stack = new Stack<>();

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.data != stack.pop().data) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('b');
        list.addLast('a');

        if (isPalindrome(list.head)) {
            System.out.println("Yes It is Palindrome");
        } else {
            System.out.println("No It is not Palindrome");
        }
    }
}
