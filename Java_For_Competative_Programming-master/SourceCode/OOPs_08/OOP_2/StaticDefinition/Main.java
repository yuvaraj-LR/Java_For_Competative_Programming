package SourceCode.OOPs_08.OOP_2.StaticDefinition;

public class Main {
    public static void main(String[] args) {
        Human yuva = new Human("Yuvaraj", 20, 200000, true);
        Human jana = new Human("Jana", 05, 10000, false);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
