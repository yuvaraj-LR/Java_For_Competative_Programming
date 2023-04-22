package SourceCode.OOPs_08.OOP_6.Comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
//public class Student  {
    String name;
    float marks;
    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  name +  " " + marks ;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        int difference = (int)(this.marks - o.marks);
        return difference;
    }
}
