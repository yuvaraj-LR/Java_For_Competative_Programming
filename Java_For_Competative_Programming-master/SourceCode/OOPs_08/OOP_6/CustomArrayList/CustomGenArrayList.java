package SourceCode.OOPs_08.OOP_6.CustomArrayList;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 10;

    private int size = 0;

    public CustomGenArrayList() {
        this.arr = new Object[DEFAULT_SIZE];
    }

    private void resize() {
        Object[] temp = new Object[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = (T)(arr[i]);
        }
        arr = temp;

//        for (int i : arr) {
//            temp[i] = arr[i];
//        }
//        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public T remove() {
        T removed = (T)(arr[--size]);

        return removed;
    }

    public T get(int index) {
        return (T)(arr[index]);
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "customArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> arrayList = new CustomGenArrayList<>();

        arrayList.add(544);
        arrayList.add(44);
        arrayList.add(54);
        arrayList.add(543);
        arrayList.add(51);
        arrayList.add(5324);
        arrayList.add(566);
        arrayList.add(5497);

        System.out.println(arrayList);

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(55);
//        list.add(55);
//        list.add(55);
//        list.add(55);
//        list.add(55);
//        list.add(59);
//
//        System.out.println(list);

//        0 - also contains value so it take a memory.
//        list.add(0);
//        System.out.println(list);
//
//        System.out.println(list.size());

    }

}
