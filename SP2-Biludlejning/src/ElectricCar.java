public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
