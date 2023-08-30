package CodingNinja.OOPs2.InheritanceVehicle;

public class Car extends Vehicle{
    int numberOfWheels;

    public void printCar() {
        System.out.println("This is in Car Class");
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: " + price);
        System.out.println("Car Wheels: " + numberOfWheels);
    }
}
