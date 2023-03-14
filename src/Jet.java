// Jet Class inherits from Airplane Class
public class Jet extends Airplane {
    // set up variables
    String fuelType = ""; // has an extra variable, fuelType
    // jet A, jet A-1, jet B
    int engines = 0; // has an extra variable, engines
    int altitude = 0; // has an extra variable, altitude
    int guns = 0; // has an extra variable, guns
    int missiles = 0; // has an extra variable, missiles

    // class constructor - default
    public Jet() {
        super("", 0.0, 0, 0.0, "", 0, 0, 0);
        this.fuelType = "";
        this.engines = 0;
        this.altitude = 0;
        this.guns = 0;
        this.missiles = 0;
    }

    // class constructor - alternate
    public Jet(String brand, double speed, int passengers, double cargo,
                      String engine, int fuelCapacity, int wings, int wheels,
                      String fuelType, int engines, int altitude, int guns, int missiles) {
        super(brand, speed, passengers, cargo, engine, fuelCapacity, wings, wheels); // uses the super constructor
        this.fuelType = fuelType; // also include the extra variable in the Jet constructor
        this.engines = engines; // also include the extra variable in the Jet constructor
        this.altitude = altitude; // also include the extra variable in the Jet constructor
        this.guns = guns; // also include the extra variable in the Jet constructor
        this.missiles = missiles; // also include the extra variable in the Jet constructor
    }

    // set fuel type
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // get fuel type
    public String getFuelType() {
        return this.fuelType;
    }

    // set engines
    public void setEngines(int engines) {
        this.engines = engines;
    }

    // get engines
    public int getEngines() {
        return this.engines;
    }

    // set altitude
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    // get altitude
    public int getAltitude() {
        if (engines > 2) {
            return this.altitude + 500;
        } else {
            return this.altitude;
        }
    }

    // set guns
    public void setGuns(int guns) {
        this.guns = guns;
    }

    // get guns
    public int getGuns() {
        return this.guns;
    }

    // set missiles
    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }

    // get missiles
    public int getMissiles() {
        return this.missiles;
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (engines > 0) {
            return super.getSpeed() + (250 * engines);
        } else {
            return super.getSpeed();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Fuel: \t\t\t" + this.getFuelType() + "\n" +
                                  "Engines: \t\t" + this.getEngines() + "\n" +
                                  "Altitude (ft): \t" + this.getAltitude() + "\n" +
                                  "Guns: \t\t\t" + this.getGuns() + "\n" +
                                  "Missiles: \t\t" + this.getMissiles() + "\n";
    }
}
