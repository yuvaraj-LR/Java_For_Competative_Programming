package SourceCode.OOPs_08.OOP_5.Interfaces;

public class Car implements Brake, Engine, Media{
    @Override
    public void start() {
        System.out.println("I am going to start");
    }

    @Override
    public void stop() {
        System.out.println("I am going to stop");
    }

    @Override
    public void media() {
        System.out.println("I am going to start the media-player");
    }

    @Override
    public void acc() {
        System.out.println("I am going to start the engine");
    }

    @Override
    public void brake() {
        System.out.println("I am going to start brake");
    }
}
