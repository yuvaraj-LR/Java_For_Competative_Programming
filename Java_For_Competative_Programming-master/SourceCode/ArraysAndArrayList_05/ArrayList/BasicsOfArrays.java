package SourceCode.ArraysAndArrayList_05.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class BasicsOfArrays {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        //Adding elements to the arrayList.
        list1.add("121");
        list1.add("122");
        list1.add("123");
        list1.add("124");
        list1.add("125");

        System.out.println("1st Arraylist --> " + list1);

        //Adding elements to the arrayList in specific index.
        list1.add(3, "126");
        System.out.println("ArrayList in specific position --> "+list1);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("211");
        list2.add("212");
        list2.add("213");
        list2.add("214");
        list2.add("215");

        System.out.println("2nd ArrayList --> " + list2);
        //Adding multiple lists.
        list1.addAll(list2);
        System.out.println("After adding 2 lists --> " +list1);

        //Adding multiple lists in specific list.
        list1.add(2, String.valueOf(list2));
        System.out.println("After adding 2 lists in specific position --> " + list1);

        //Clearing the Lists
        list1.clear();
        System.out.println("After clearing list1 --> " + list1);


    }
}
