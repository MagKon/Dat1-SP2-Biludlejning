public class DieselCar extends AFuelCar {
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int fee = 0;

        if (getKmPrLitre() >= 20 && getKmPrLitre() < 50) {
            fee += 330; //add base fee
            fee += 130; //add fee for equalization tax
        }
        else if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            fee += 1050; //add base fee
            fee += 1390; //add fee for equalization tax
        }
        else if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            fee += 2340; //add base fee
            fee += 1850; //add fee for equalization tax
        }
        else if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            fee += 5500; //add base fee
            fee += 2770; //add fee for equalization tax
        }
        else if (getKmPrLitre() < 5){
            fee += 10470; //add base fee
            fee += 15260; //add fee for equalization tax
        }
        else
            fee += 330 + 130; //add base fee and equalization tax as default unless otherwise specified

        if (!hasParticleFilter())
            fee += 1000;

        return fee;
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
        return super.toString() + String.format(", Fuel type: %s %s, km/l %d", getFuelType(), hasParticleFilter() ? "(with filter)" : "(without filter)", getKmPrLitre());
    }
}
