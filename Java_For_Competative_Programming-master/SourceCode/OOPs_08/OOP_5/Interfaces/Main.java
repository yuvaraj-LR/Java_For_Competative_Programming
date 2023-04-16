package SourceCode.OOPs_08.OOP_5.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//
//        car.start();
//        car.stop();
//        car.engine();

       CustomCar customCar = new CustomCar();

       customCar.start();
       customCar.startMusic();
       customCar.stopMusic();
       customCar.stop();
       customCar.upgradeEngine();
       customCar.start();
       customCar.startMusic();
       customCar.stopMusic();
       customCar.stop();


    }
}
