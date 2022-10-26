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

         int kmPrL = (int) Math.round(100/lPrHundredKm);

        if (kmPrL >= 20 && kmPrL < 50)
            return 330;
        else if (kmPrL >= 15 && kmPrL < 20)
            return 1050;
        else if (kmPrL >= 10 && kmPrL < 15)
            return 2340;
        else if (kmPrL >= 5 && kmPrL < 10)
            return 5500;
        else if (kmPrL < 5)
            return 10470;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %d %d %d", getBatteryCapacityKWh(), getMaxRangeKm(), getWhPrKm());
    }
}
