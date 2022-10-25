public abstract class AFuelCar {
    private final int kmPrLitre;

    public AFuelCar(int kmPrLitre){
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public abstract int getKmPrLitre();
}
