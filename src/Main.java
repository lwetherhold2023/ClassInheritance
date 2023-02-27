public class Main {
    public static void main(String[] args) {
        // set up boat object of the base Vehicle class
        Vehicle boat1 = new Vehicle("Boat", 30.0, 2000, 100000.00);

        // output info
        System.out.println(boat1);

        // set up car object of the child Car class
        Car car1 = new Car("BMW", 200.00, 2, 100.00, 30.0);
        car1.setSpoiler(true);
        car1.setStereo(true);

        // output info
        System.out.println(car1);
    }
}