// The Base Vehicle Class, implements the Speedometer interface
public class Vehicle implements Speedometer {
    // set up variables
    protected String brand = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected double cargoWeight = 0.0;

    // class constructor - default
    public Vehicle() {
        this.brand = "";
        this.speed = 0.0;
        this.passengers = 0;
        this.cargoWeight = 0.0;
    }

    // class constructor - alternate 1
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // class constructor - alternate 2
    public Vehicle(String brand, double speed, int passengers, double cargoWeight) {
        this.brand = brand;
        this.speed = speed;
        this.passengers = passengers;
        this.cargoWeight = cargoWeight;
    }

    // set brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // get brand
    public String getBrand() {
        return this.brand;
    }

    // set speed
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // get speed
    public double getSpeed() {
        return this.speed;
    }

    // set passengers
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    // get passengers
    public int getPassengers() {
        return this.passengers;
    }

    // set cargo weight
    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    // get cargo weight
    public double getCargoWeight() {
        return this.cargoWeight;
    }

    // toString method
    public String toString() {
        return "Brand: \t\t\t" + this.getBrand() + "\n" +
               "Speed (mph): \t" + this.getSpeed() + "\n" +
               "Passengers: \t" + this.getPassengers() + "\n" +
               "Cargo (lbs): \t" + this.getCargoWeight() + "\n";
    }
}