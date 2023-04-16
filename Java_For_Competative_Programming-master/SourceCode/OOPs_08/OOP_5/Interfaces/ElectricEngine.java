package SourceCode.OOPs_08.OOP_5.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElecticEngine Starts");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine Stop");
    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine Accelerate");
    }
}
