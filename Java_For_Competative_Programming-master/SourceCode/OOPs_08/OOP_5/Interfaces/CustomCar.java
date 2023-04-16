package SourceCode.OOPs_08.OOP_5.Interfaces;

public class CustomCar {
    private Engine engine;
    private Media player = new CDPlayer();
    public CustomCar() {
        engine = new PowerEngine();
    }

    public CustomCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        engine = new ElectricEngine();
    }
}
