package SourceCode.OOPs_08.OOP_6.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i*5);
        }

//        This is the lambda expression.  We just print the foreach loop in a single line.
//        list.forEach((item) -> System.out.println(item * 4));

//        Lambda Expression is a consumer type.  So, here we call the consumer interface type
//        and produces the output.
        Consumer<Integer> con = (item) -> System.out.println(item * 4);
        list.forEach(con);

        Operation sum = (a, b) -> (a + b);
        Operation sub = (a, b) -> (a - b);
        Operation mul = (a, b) -> (a * b);

        Main myCalc = new Main();
        System.out.println("ADD -> " + myCalc.operate(5, 8, sum));
        System.out.println("SUB -> " + myCalc.operate(5, 8, sub));
        System.out.println("MUL -> " + myCalc.operate(5, 8, mul));

    }

    private int operate (int a, int b, Operation op) {
        return op.operation(a, b);
    }

//    int addition(int i, int i1) {
//        return i + i1;
//    }
}

interface Operation {
    int operation (int a, int b);
}
