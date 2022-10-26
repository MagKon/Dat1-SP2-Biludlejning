public class Main {
    public static void main(String[] args) {
        Car gas1 = new GasolineCar("AB 12 345", "Ford", "Focus", 5, 20);
        Car gas2 = new GasolineCar("CD 34 567", "Ford", "Mustang", 5, 10);
        Car gas3 = new GasolineCar("EF 56 789", "Ford", "Mondeo", 5, 42);

        Car dies1 = new DieselCar("GH 78 901", "VW", "Golf GTI", 5, 39, true);
        Car dies2 = new DieselCar("IJ 90 123", "Volvo", "383", 5, 50, false);
        Car dies3 = new DieselCar("KL 12 345", "Toyota", "Land Cruiser", 7, 29, true);

        Car elec1 = new ElectricCar("GH 78 901", "Tesla", "Model S", 5, 100, 502);
        Car elec2 = new ElectricCar("IJ 90 123", "Tesla", "Model X", 5, 105, 543);
        Car elec3 = new ElectricCar("KL 12 345", "BMW", "i3", 3, 38, 203);

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(gas1);
        fleet.addCar(gas2);
        fleet.addCar(gas3);
        fleet.addCar(dies1);
        fleet.addCar(dies2);
        fleet.addCar(dies3);
        fleet.addCar(elec1);
        fleet.addCar(elec2);
        fleet.addCar(elec3);

        System.out.println(fleet);
        
        System.out.println("Total registration fee for fleet: " + fleet.getTotalRegistrationFeeForFleet() + " kr.");
    }
}