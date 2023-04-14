package SourceCode.OOPs_08.OOP_2.StaticDefinition;

public class Human {
    String name;
    int age;
    float salary;
    boolean isWorking;
    static int population;
    public Human(String name, int age, float salary, boolean isWorking) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isWorking = isWorking;
        Human.population += 1;
    }

//    public static void demo() {
//        System.out.println(age);
//    }




}
