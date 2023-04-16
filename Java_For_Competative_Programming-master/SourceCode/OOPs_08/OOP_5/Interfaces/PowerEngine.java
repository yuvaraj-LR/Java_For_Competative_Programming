package SourceCode.OOPs_08.OOP_5.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine Starts");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stop");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine Accelerate");
    }
}
