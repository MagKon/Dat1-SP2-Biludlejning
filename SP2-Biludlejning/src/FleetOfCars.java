import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<Car>();

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {

        int total = 0;

        for (Car car : fleet) {
            total += car.getRegistrationFee();
        }

        return total;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        for (Car car : fleet) {
            result.append(car.toString()).append(" \n");
        }

        return result.toString();
    }
}
