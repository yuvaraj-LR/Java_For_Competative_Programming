package CodingNinja.OOPs3.Interface;

public class Vehicle {

    public static void main(String[] args) {
        VehicleUse vu = new VehicleUse() {
            @Override
            public boolean isMotorized() {
                return super.isMotorized();
            }
            @Override
            public String companyName() {
                return super.companyName();
            }
        };
    }
}
