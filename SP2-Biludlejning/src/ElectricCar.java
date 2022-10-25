public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm() {
        return batteryCapacity / maxRange;
    }

    @Override
    public String getRegistrationNumber() {
        return super.registrationNumber;
    }

    @Override
    public String getMake() {
        return super.make;
    }

    @Override
    public String getModel() {
        return super.model;
    }

    @Override
    public int getNumberOfDoors() {
        return super.numberOfDoors;
    }

    @Override
    public int getRegistrationFee() {
        int fee = 0;

        fee += getWhPrKm()/91.25;

        fee /= 100;

        return fee;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %d %d %d", getBatteryCapacity(), getMaxRange(), getWhPrKm());
    }
}
