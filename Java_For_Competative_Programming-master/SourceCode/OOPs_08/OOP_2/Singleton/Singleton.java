package SourceCode.OOPs_08.OOP_2.Singleton;

public class Singleton {
    String s1;

    // By using the private access modifier we cannot be able to call this in
    // any other class.
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // Check whether the instance was created or not. Only one object
        // must be created.
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

