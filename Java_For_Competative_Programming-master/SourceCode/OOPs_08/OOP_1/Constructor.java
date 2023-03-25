package SourceCode.OOPs_08.OOP_1;

public class Constructor {

    public static void main(String[] args) {
        Students stud = new Students(50, "vicky", 80.5f);

//        // Declaring values
//        // Here, This is a way to fill the values for the objects.
//        stud.rollNo = 63;
//        stud.name = "Yuvaraj";
//        stud.marks = 85.4f;


        System.out.println(stud.rollNo);
        System.out.println(stud.name);
        System.out.println(stud.marks);

        stud.welcome();

        //Here we call the constructor with another constructor.
        Students stud1 = new Students();
        System.out.println(stud1.rollNo);
        System.out.println(stud1.name);
        System.out.println(stud1.marks);

    }
}

class Students {
    int rollNo;
    String name;
    float marks;

    // This is the default constructor created when the object has been created.

    // this - is the keyword used to bind the values from object has been created.
    // If the arguments name is = to object name "this" keyword seperates the names of
    // the name.

//    Students() {
//        this.rollNo = 21;
//        this.name = "Yuva";
//        this.marks = 88.2f;
//    }

    //This is the way to declare the values in direct method.
    //Used to improve the speed and effiency of the O/P.
    Students() {
        this (21, "Yuvaa", 87.5f);
    }

    // This is the parameterized constructor when we pass the argument to the objects.
    Students(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // This is the constructor call another constructor.
    Students(Students other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    void welcome() {
        System.out.println("Welcome " + this.name);
    }
}
