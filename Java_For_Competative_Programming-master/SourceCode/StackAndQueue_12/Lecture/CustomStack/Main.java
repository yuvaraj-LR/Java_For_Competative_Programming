package SourceCode.StackAndQueue_12.Lecture.CustomStack;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack();
//
//        stack.push(29);
//        stack.push(22);
//        stack.push(1);
//        stack.push(98);
//        stack.push(37);
//        stack.push(55);
//        System.out.println("Element Position ->" + stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        DynamicStack dStack = new DynamicStack(5);

        dStack.push(42);
        dStack.push(99);
        dStack.push(52);
        dStack.push(66);
        dStack.push(52);
        dStack.push(12);
        dStack.push(29);
        dStack.push(32);
        dStack.push(87);
        dStack.push(11);
        dStack.push(41);
        dStack.push(90);
        dStack.push(64);

        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
    }

}
