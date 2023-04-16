package SourceCode.OOPs_08.OOP_5.Interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music Starts");
    }

    @Override
    public void stop() {
        System.out.println("Music Stops");
    }

    @Override
    public void media() {
        System.out.println("I am in CDPlayer");
    }

}
