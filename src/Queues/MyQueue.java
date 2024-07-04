package Queues;

public class MyQueue {
//    ==================================== USING ARRAY ===================================
//    private final int[] queue;
//    private final int size;
//    private int rear;
//
//    public MyQueue(int size) {
//        queue = new int[size];
//        rear = -1;
//        this.size = size;
//    }
//
//    public boolean isEmpty() {
//        return rear == -1;
//    }
//
//    public boolean isFull() {
//        return rear == size - 1;
//    }
//
//    public void add(int data) {
//        if (isFull()) {
//            System.out.println("MyQueue is full");
//            return;
//        }
//        queue[++rear] = data;
//    }
//
//    public int remove() {
//        if (isEmpty()) {
//            System.out.println("MyQueue is empty");
//            return -1;
//        }
//        int data = queue[0];
//        for (int i = 0; i < rear; i++) {
//            queue[i] = queue[i + 1];
//        }
//        rear--;
//        return data;
//    }
//
//    public int peek() {
//        if (isEmpty()) {
//            System.out.println("MyQueue is empty");
//            return -1;
//        }
//        return queue[0];
//    }



    private Node front;
    private Node rear;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("MyQueue is empty");
            return -1;
        }
        int data = front.data;
        if (front == rear) {
            rear = front = null;
        } else {
            front = front.next;
        }
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("MyQueue is empty");
            return -1;
        }
        return front.data;
    }
}