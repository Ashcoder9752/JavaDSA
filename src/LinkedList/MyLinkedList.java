package LinkedList;

public class MyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public static class Node {
        public int data;
        public Node next;

        public Node() {}

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void addFirst(int data) {
        if (size == 0) {
            head = tail = new Node(data);
            size = 1;
            return;
        }
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
        head = new Node(data, head);
        size++;
    }

    public void add(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            if (temp.next == null) {
                System.out.println("Invalid index");
                return;
            }
            temp = temp.next;
            i++;
        }
        if (temp.next == null) {
            addLast(data);
            return;
        }
        temp.next = new Node(data, temp.next);
        size++;
    }

    public void addLast(int data) {
        if (size == 0) {
            head = tail = new Node(data);
            size = 1;
            return;
        }
//        Node newNode = new Node(data);
//        tail.next = newNode;
//        tail = newNode;
        tail.next = new Node(data, tail.next);
        size++;
        tail = tail.next;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        prev.next = null;
        size--;
        tail = prev;
    }

    public void remove(int data) {
        int index = search(data);
        if (index == -1) {
            System.out.println("Data does not exist");
            return;
        }
        removeIndex(index);
    }

    public void removeIndex(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            if (temp.next == null) {
                System.out.println("Invalid index");
                return;
            }
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    public int search(int data) {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int recursiveSearch(int data, Node head) {
        if (head == null) {
            return -1;
        }
        if (head.data == data) {
            return 0;
        }
        int index = recursiveSearch(data, head.next);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    public void reverse() {
//        Node prev = null;
//        Node curr = tail = head;
//
//        while (curr != null) {
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        head = prev;

        tail = head;
        head = recursiveReverse(head);
    }

    public Node recursiveReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]\n";
        }

        Node temp = head;
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
