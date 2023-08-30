package CodingNinja.Stack.StackByArray;

 class CustomStack {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int top = -1;

    public CustomStack() {
        data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size ) {
        data = new int[size];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(int element) {

        if(isFull()) {
            int[] temp = new int[(data.length - 1) * 2];
            int i = 0;
            for (; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++top] = element;
    }

    public int inTop() {
        return data[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int removedElement = data[0];

        for (int i = 1; i <= top; i++) {
            data[i - 1] = data[i];
        }

        top--;
        return removedElement;

    }
    public void Display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " <- ");
        }

        System.out.println("END!");
    }
}
