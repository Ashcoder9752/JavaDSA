package Queues;

public class CircularQueue {
    private final int[] queue;
    private final int size;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void add(int item) {
        if (isFull()) {
            System.out.println("MyQueue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = item;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("MyQueue is empty");
            return -1;
        }
        int item = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("MyQueue is empty");
            return -1;
        }
        return queue[front];
    }
}