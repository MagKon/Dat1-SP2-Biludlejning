public abstract class ACar implements Car {
    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public abstract String getRegistrationNumber();

    public abstract String getMake();

    public abstract String getModel();

    public abstract int getNumberOfDoors();

    @Override
    public String toString() {
        return String.format("%s %s %s %d", getRegistrationNumber(), getMake(), getModel(), getNumberOfDoors());
    }
}
