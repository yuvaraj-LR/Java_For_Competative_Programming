package CodingNinja.Stack.StackByLL;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack<Integer> stack = new CustomStack<>();

        stack.push(87);
        stack.push(68);
        stack.push(61);
        stack.push(93);
        stack.push(51);

        stack.push(87);
        stack.push(68);
        stack.push(61);
        stack.push(93);
        stack.push(51);

        stack.push(87);
        stack.push(68);
        stack.push(61);
        stack.push(93);
        stack.push(51);

        stack.pop();
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());

    }
}
