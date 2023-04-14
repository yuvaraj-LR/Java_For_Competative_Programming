package SourceCode.OOPs_08.OOP_3.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.print("Default Value: ");
//        System.out.println(box1.length + " " + box1.height + " " + box1.width);
//
//        Box box2 = new Box(4);
//        System.out.print("Cube Value: ");
//        System.out.println(box2.length + " " + box2.height + " " + box2.width);
//
//        Box box3 = new Box(4.1, 5.5, 7.7);
//        System.out.print("Pass all Value: ");
//        System.out.println(box3.length + " " + box3.height + " " + box3.width);
//
//        Box box4 = new Box(box3);
//        System.out.print("Pass Class Value: ");
//        System.out.println(box4.length + " " + box4.height + " " + box4.width);

//        Here the reference Class will have more rights to display the specific constructor.
//        Here the Box-Weight Child class has been called, but we cannot be able to use it.

        Box box5 = new BoxWeight(2.2, 5.5, 6.7, 4.4);
        System.out.println(box5.length + " " + box5.height + " " + box5.width);

//        BoxWeight box6 = new Box(2.2, 4.4, 5.5);
//        System.out.println(box6.length + " " + box6.height + " " + box6.width + " " + box6.weight);

        BoxPrice box6 = new BoxPrice(2.3, 5.5, 6.7, 3.3, 55);
        System.out.println(box6.length + " " + box6.height + " " + box6.width + " " + box6.weight + " " + box6.price);


    }
}
