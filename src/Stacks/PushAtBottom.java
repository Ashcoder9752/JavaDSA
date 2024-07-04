package Stacks;

public class PushAtBottom {
    private static void pushAtBottom(MyStack myStack, int data) {
        if (myStack.isEmpty()) {
            myStack.push(data);
            return;
        }
        
        
        int popped = myStack.pop();
        pushAtBottom(myStack, data);
        myStack.push(popped);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        pushAtBottom(myStack, 4);

        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
