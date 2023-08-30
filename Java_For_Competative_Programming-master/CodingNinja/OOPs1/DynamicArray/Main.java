package CodingNinja.OOPs1.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

//        System.out.println("Array size: " + arr.size());
//        System.out.println("Array is Empty: " + arr.isEmpty());

        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

//        System.out.println("Array get valid index: " + arr.getIndex(3));
//        System.out.println("Array get invalid index: " + arr.getIndex(7));
//
//        arr.setIndex(3, 10);
//        System.out.println("Array after set value: " + arr.getIndex(3));
//        System.out.println("Array size: " + arr.size());
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.getIndex(i) + " ");
//        }
//        System.out.println();
//
//
//        for (int i = arr.size(); i < 7; i++) {
//            arr.add(i);
//        }
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.getIndex(i) + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < 3; i++) {
//            arr.removeLast();
//        }
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.getIndex(i) + " ");
//        }

        arr.addIndex(0 ,1);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.getIndex(i) + " ");
        }
        System.out.println();
        arr.removeIndex(10);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.getIndex(i) + " ");
        }
    }
}
