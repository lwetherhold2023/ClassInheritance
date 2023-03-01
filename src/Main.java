public class Main {
    public static void main(String[] args) {
        // set up boat object of the base Vehicle class
        Vehicle boat1 = new Vehicle("Maersk (Boat Vehicle)", 30.0, 2000, 100000.00);

        // output info
        System.out.println(boat1);

        // set up car object of the child Car class
        Car car1 = new Car("BMW (Car Vehicle)", 200.00, 2, 100.00, "White", 4, 30.0);
        car1.setSpoiler(true);
        car1.setStereo(true);

        // output info
        System.out.println(car1);

        // set up electric object of the child Electric class
        Car electricCar1 = new Electric("Chevy (Electric Car Vehicle)", 200.00, 4, 100.00, "Steel gray", 4, 30.0, "Lithium-ion", 150.0);

        // output info
        System.out.println(electricCar1);
    }
}