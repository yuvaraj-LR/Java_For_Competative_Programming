package CodingNinja.Stack.Questions;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            input.push(i + 5);
        }

        reverseStack(input, extra);

        while(!input.isEmpty()) {
            System.out.print(input.pop() + " ");
        }
    }

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here
        Stack<Integer> temp;

        temp = reverse(input);
        extra = reverse(temp);
        input = reverse(extra);
    }

    public static Stack<Integer> reverse (Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty()) {
            int element = stack.pop();
            temp.push(element);
        }

        return temp;
    }

}
