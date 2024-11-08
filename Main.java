class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    // Constructor
    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    // Method to push an element x to stack1
    public void push1(int x) {
        // Check for overflow
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Method to push an element x to stack2
    public void push2(int x) {
        // Check for overflow
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Method to pop an element from stack1
    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Method to pop an element from stack2
    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

       System.out.println("Popped element from stack1 is " + ts.pop1());
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }
}
