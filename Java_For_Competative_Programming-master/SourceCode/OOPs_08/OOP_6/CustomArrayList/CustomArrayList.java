package SourceCode.OOPs_08.OOP_6.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {

    private int[] arr;
    private static int DEFAULT_SIZE = 3;

    private int size = 0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];

        for (int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public int remove() {
        int removed = arr[--size];

        return removed;
    }

    public int get(int index) {
        return arr[index];
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
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(19);
        arrayList.add(20);
        arrayList.add(0);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        arrayList.set(3, 15);
        arrayList.remove();
        arrayList.remove();
        arrayList.remove();
        System.out.println(arrayList);
    }

}
