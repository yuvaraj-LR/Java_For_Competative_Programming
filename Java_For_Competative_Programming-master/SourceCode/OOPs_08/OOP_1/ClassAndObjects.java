package SourceCode.OOPs_08.OOP_1;

public class ClassAndObjects {
    public static void main(String[] args) {
        //Here to create a list of 5 roll No
        int[] rollNo = new int[5];

        //Here to create a list of 5 name
        String[] name = new String[5];

        //Here to create a list of 5 marks
        float[] marks = new float[5];

        //For Storing a student of the data, we need to create 3 list.
        //So, here the OOP comes play to vanish the creation of data into 1 list.

        Students[] students = new Students[5];

        // System.out.println(Arrays.toString(students));   //[null, null, null, null, null]
        // The variables has no value so it was declaring the default value null for referenced data type.
        // The default value for primitive data type may differ.

    }
}

class Student {
    int rollNo;
    String name;
    float marks;

}
