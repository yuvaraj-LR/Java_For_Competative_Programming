package SourceCode.StackAndQueue_12.Lecture.CustomStack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public boolean push(int element) throws CustomStackException {

        if(isFull()) {
            throw new CustomStackException("Cannot Push! Stack is already full.");
        }

        ptr++;
        data[ptr] = element;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public int pop() throws CustomStackException {

        if (isEmpty()) {
            throw new CustomStackException("Cannot Pop! Stack is empty.");
        }

        return data[ptr--];
    }

    private boolean isEmpty() {
        return ptr < 0;
    }

    public int peek() throws CustomStackException {

        if (isEmpty()) {
            throw new CustomStackException("Cannot Peek! Stack is empty.");
        }

        return data[ptr];
    }


}
