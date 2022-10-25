public abstract class AFuelCar extends ACar {
    protected final int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;
    }
}
