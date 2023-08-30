package CodingNinja.OOPs3.Interface;

public class VehicleUse implements VehicleInterface{

    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String companyName() {
        return null;
    }
}
