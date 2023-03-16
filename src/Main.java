public class Main {
    public static void main(String[] args) {
        // set up boat object of the base Vehicle class
        Vehicle v = new Vehicle("Maersk (Vehicle)", 30.0, 2000, 100000.0);

        // set up car object of the child Car class
        Car car1 = new Car("BMW (Car Vehicle)", 200.0, 2, 100.0, "White", 4, 30.0);
        car1.setSpoiler(true);
        car1.setStereo(true);

        // set up electric object of the child Electric class
        Car electricCar1 = new Electric("Chevy (Electric Car Vehicle)", 101.0, 4, 50.0, "Slate gray", 4, 102.0, "Lithium-ion", 259.0);

        // set up hydrogen object of the child Hydrogen class
        Car hydrogenCar1 = new Hydrogen("Hyundai (Hydrogen Car Vehicle)", 111.0, 5, 125.0, "Copper", 4, 61.0, "Alkaline", 380.0);
        ((Hydrogen)hydrogenCar1).setBattery(true);

        // set up boat object of the child Boat class
        Boat boat1 = new Boat("Yacht (Boat Vehicle)", 80.5, 13, 500.0, "Wood", 2.5);
        boat1.setMachinery(true);

        // set up cruise ship object of the child CruiseShip class
        CruiseShip cruiseShip1 = new CruiseShip("Wonder of the Seas (Cruise Ship Boat Vehicle)", 25.0, 6988, 100000.0, "Steel", 0.004, "Hawai'i");
        cruiseShip1.setMachinery(true);
        cruiseShip1.setCafeteria(true);
        cruiseShip1.setPool(true);

        // set up airplane object of the child Airplane class
        Airplane airplane1 = new Airplane("Delta (Airplane Vehicle)", 575.0, 660, 33000.0, "Jet", 26024, 2, 18);
        airplane1.setSpoiler(true);

        // set up jet object of the child Jet class
        Jet jet1 = new Jet("Bombardier (Jet Airplane Vehicle)", 750.0, 12, 500.0, "Reciprocating", 1612, 4, 4, "Jet A", 4, 41000, 2, 3);
        jet1.setPropeller(true);
        jet1.setSpoiler(true);

        // set up train object of the child Train class
        Train train1 = new Train("Shanghai Maglev (Train Vehicle)", 59.0, 150, 525.0, "Electric", 12);
        train1.setMaglev(true);

        // set up spaceship object of the child Spaceship class
        Spaceship spaceship1 = new Spaceship("NASA (Spaceship Vehicle)", 17500.0, 10, 675.0, "Rocket Engine", "Liquid Hydrogen", 11000);

        // output info
        System.out.println(v);
        System.out.println(car1);
        System.out.println(electricCar1);
        System.out.println(hydrogenCar1);
        System.out.println(boat1);
        System.out.println(cruiseShip1);
        System.out.println(airplane1);
        System.out.println(jet1);
        System.out.println(train1);
        System.out.println(spaceship1);
    }
}