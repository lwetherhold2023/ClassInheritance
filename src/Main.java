public class Main {
    public static void main(String[] args) {
        // set up boat object of the base Vehicle class
        Vehicle boat1 = new Vehicle("Maersk (Boat Vehicle)", 30.0, 2000, 100000.00);

        // set up car object of the child Car class
        Car car1 = new Car("BMW (Car Vehicle)", 200.00, 2, 100.00, "White", 4, 30.0);
        car1.setSpoiler(true);
        car1.setStereo(true);

        // set up electric object of the child Electric class
        Car electricCar1 = new Electric("Chevy (Electric Car Vehicle)", 101.00, 4, 50.00, "Slate gray", 4, 102.0, "Lithium-ion", 259.0);

        // set up hydrogen object of the child Hydrogen class
        Car hydrogenCar1 = new Hydrogen("Hyundai (Hydrogen Car Vehicle)", 111.00, 5, 125.00, "Copper", 4, 61.0, "Alkaline", 380.0);
        ((Hydrogen)hydrogenCar1).setBattery(true);

        // output info
        System.out.println(boat1);
        System.out.println(car1);
        System.out.println(electricCar1);
        System.out.println(hydrogenCar1);
    }
}