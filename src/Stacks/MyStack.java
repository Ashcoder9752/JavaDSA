package Stacks;

public class MyStack {
    // --------------------ARRAY IMPLEMENTATION-----------------------
//    private int top;
//    private final int[] stack;
//
//    public MyStack() {
//        top = -1;
//        stack = new int[10];
//    }
//
//    public MyStack(int capacity) {
//        top = -1;
//        stack = new int[capacity];
//    }
//
//    // isEmpty
//    public boolean isEmpty() {
//        return top == -1;
//    }
//
//    //  isFull
//    public boolean isFull() {
//        return top == stack.length - 1;
//    }
//
//    // push
//    public void push(int data) {
//        if (isFull()) {
//            System.out.println("MyStack is full");
//            return;
//        }
//        stack[++top] = data;
//    }
//
//    // pop
//    public int pop() {
//        if (isEmpty()) {
//            System.out.println("MyStack is empty");
//            return -1;
//        }
//        int data = stack[top];
//        stack[top--] = 0;
//        return data;
//    }
//
//    // peek
//    public int peek() {
//        if (isEmpty()) {
//            System.out.println("MyStack is empty");
//            return -1;
//        }
//        return stack[top];
//    }


    // ---------------------- ARRAYLIST IMPLEMENTATION -----------------------
//    private final ArrayList<Integer> stack;
//
//    public MyStack() {
//        stack = new ArrayList<>();
//    }
//
//    // isEmpty
//    public boolean isEmpty() {
////        return stack.size() == 0;
//        return stack.isEmpty();
//    }
//
//    // push
//    public void push(int data) {
//        stack.add(data);
//    }
//
//    // pop
//    public int pop() {
//        if (isEmpty()) {
//            System.out.println("MyStack is empty");
//            return -1;
//        }
////        int data = stack.get(stack.size() - 1);
////        stack.remove(stack.size() - 1);
////        return data;
//
//
////        return stack.remove(stack.size() - 1);
//
//        return stack.removeLast();
//    }
//
//    // peek
//    public int peek() {
//        if (isEmpty()) {
//            System.out.println("MyStack is empty");
//            return -1;
//        }
////        return stack.get(stack.size() - 1);
//        return stack.getLast();
//    }

    // --------------------- LINKED LIST IMPLEMENTATION ----------------------------
    private Node top;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public MyStack() {
        this.top = null;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // push
    public void push(int data) {
//        Node newNode = new Node(data);
//        newNode.next = top;
//        top = newNode;
        top = new Node(data, this.top);
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("MyStack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("MyStack is empty");
            return -1;
        }
        return top.data;
    }
}
