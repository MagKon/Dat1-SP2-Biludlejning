public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }
    @Override
    public int getRegistrationFee() {
        if (getKmPrLitre() >= 20 && getKmPrLitre() < 50)
            return 330;
        else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20)
            return 1050;
        else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15)
            return 2340;
        else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10)
            return 5500;
        else if (getKmPrLitre() < 5)
            return 10470;
        else
            return 330; //default unless otherwise specified
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
    public String toString() {
        return super.toString() + String.format(", Fuel type: %s, km/l: %d", getFuelType(), getKmPrLitre());
    }
}
