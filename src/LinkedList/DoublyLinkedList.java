package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    private int size;

    static class Node {
        int data;
        Node next;
        Node prev;

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            Node temp = head;
            while (index-- > 0) {
                temp = temp.next;
            }
            return temp.data;
        } else { return -1; }
    }

    public void addAtHead(int data) {
        if (size == 0) {
            head = tail = new Node(data);
            size = 1;
            return;
        }
        head = new Node(data, null, head);
        size++;
    }

    public void addAtTail(int data) {
        if (size == 0) {
            head = tail = new Node(data);
            size = 1;
            return;
        }
        tail.next = new Node(data, tail, null);
        tail = tail.next;
        size++;
    }


    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(data);
            return;
        }
        if (index == size) {
            addAtTail(data);
            return;
        }

        Node temp = head;
        while (--index > 0) {
            temp = temp.next;
        }
        temp.next.prev = new Node(data, temp, temp.next);
        temp.next = temp.next.prev;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        if (index == 0) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
        Node temp = head;
        while (--index > 0) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (size == 0) {
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
