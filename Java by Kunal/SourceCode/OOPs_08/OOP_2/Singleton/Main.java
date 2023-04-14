package SourceCode.OOPs_08.OOP_2.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);

        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj3);


    }
}
