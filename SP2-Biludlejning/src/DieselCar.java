public class DieselCar extends AFuelCar {
    private boolean particleFilter;

    public DieselCar(boolean particleFilter, int kmPrLitre) {
        super(kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
//        if (getKmPrLitre() < 20) {
//            fee += 1000;
//        } else if (getKmPrLitre() < 50) {
//            fee += 2000;
//        } else {
//            fee += 3000;
//        }
//        if (hasParticleFilter()) {
//            fee += 500;
//        }
        return fee;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", getFuelType(), hasParticleFilter() ? "with" : "without", getKmPrLitre());
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    public int getKmPrLitre() {
        return 0;
    }
}
