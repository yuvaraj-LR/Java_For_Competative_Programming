package SourceCode.OOPs_08.OOP_6.CloneObject;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human yuvaraj = new Human(21, "Yuvaraj");
//        Object Cloning -> by using the new keyword creating the new
//        object will be complex. So, we will use object clone method in Java.
//        Human yuvi = new Human(yuvaraj);

        Human yuvi = (Human) yuvaraj.clone();

        System.out.println(yuvi.age + " " + yuvi.name);



    }
}
