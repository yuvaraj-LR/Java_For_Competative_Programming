package CodingNinja.OOPs2.InheritanceVehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
//        Setting value
        ve.color = "Red";
        ve.price = 150000;
        ve.print();

        Car car = new Car();
//        Setting Value
        car.color = "Blue";
        car.price = 2000000;
        car.numberOfWheels = 4;
//        We don't have print() method in car class but we inherit from the parent Vehicle Class.
        car.print();
        car.printCar();

        Bicycle bi = new Bicycle();
        bi.color = "Yellow";
        bi.price = 9000;
        bi.print();
    }
}
