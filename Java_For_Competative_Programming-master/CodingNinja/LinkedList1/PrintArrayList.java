package CodingNinja.LinkedList1;

import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(90);
        arr.add(10);
        arr.add(20);
        arr.add(30);

//        Print by default print method.
//        System.out.println(arr);

//      Print by normal for-loop - the i will work as index.
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

//        Print by enhanced for-loop - i will work as element in the array.
        for (int i : arr) {
            System.out.println(i);
        }




    }
}
