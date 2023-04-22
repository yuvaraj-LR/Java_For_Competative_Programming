package SourceCode.OOPs_08.OOP_6.Comparing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {


    public static void main(String[] args) {
        Student s2 = new Student("Janagan", 94.33f);
        Student s1 = new Student("Yuvaraj", 87.54f);
        Student s3 = new Student("Dhathva", 98.17f);

//         This is for checking, If the condition to returns the positive value otherwise returns
//         the negative value.
//        System.out.println(s2.compareTo(s1));
//        if (s1.compareTo(s2) < 1) {
//            System.out.println("Jangan scores more marks.");
//        }
//        else {
//            System.out.println("Yuvi scores more marks.");
//        }

        Student[] std = {s1, s2, s3};

//        This is the normal one.
//        Arrays.sort(std, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int) (o1.marks - o2.marks);
//            }
//        });

//        This is the lambda function one.
        Arrays.sort(std, (o1, o2) -> -(int) (o1.marks - o2.marks));

        System.out.println(Arrays.toString(std));

    }
}
