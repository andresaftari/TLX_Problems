package TPdanJurnal.stack;

// UTILITY (TOOLS) CLASS
public class Stack {
    int top = -1;
    static final int MAX = 1000;
    char[] stack = new char[MAX];

    public void push(char element) {
        if (top > MAX)
            System.out.println("Stack is full");
        else {
            stack[++top] = element;
            System.out.println("pushed to TPdanJurnal.stack: " + element);
        }
    }

    public char pop() {
        if (!isEmpty()) {
            System.out.println("popped from TPdanJurnal.stack: " + stack[top]);
            return stack[top--];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public boolean isEmpty() {
        if (top < 0) {
            System.out.println("TPdanJurnal.stack empty");
            return true;
        } else {
            return false;
        }
    }

    public char stackTop() {
        return stack[top];
    }
}