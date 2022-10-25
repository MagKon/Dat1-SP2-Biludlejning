public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return (batteryCapacity*1000) / maxRange;
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
        double lPrHundredKm = getWhPrKm()/91.25;

         int kmPrl = (int) Math.round(100/lPrHundredKm);

        return kmPrl;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %d %d %d", getBatteryCapacityKWh(), getMaxRangeKm(), getWhPrKm());
    }
}
