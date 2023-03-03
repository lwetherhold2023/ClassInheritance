// Hydrogen Class inherits from Car Class
public class Hydrogen extends Car {
    // set up variables
    String fuelCell = ""; // has an extra variable, fuelCell
    // PEM (proton exchange membrane), DMFC (direct methanol), MCFC (molton carbonate), PAFC (phosphoric acid), SOFC (solid oxide) and AFC (alkaline)
    double range = 0; // has an extra variable, range
    boolean battery = false; // has a modifier, battery

    // class constructor - default
    public Hydrogen() {
        super("", 0.0, 0, 0.0, "", 0, 0.0);
        this.fuelCell = "";
        this.range = 0.0;
    }

    // class constructor - alternate
    public Hydrogen(String brand, double speed, int passengers, double cargo,
                    String color, int wheels, double mpg,
                    String fuelCell, double range) {
        super(brand, speed, passengers, cargo, color, wheels, mpg); // uses the super constructor
        this.fuelCell = fuelCell; // also include the extra variable in the Hydrogen constructor
        this.range = range; // also include the extra variable in the Hydrogen constructor
    }

    // set fuelCell
    public void setFuelCell(String fuelCell) {
        this.fuelCell = fuelCell;
    }

    // get fuelCell
    public String getFuelCell() {
        return this.fuelCell;
    }

    // set range
    public void setRange(double range) {
        this.range = range;
    }

    // get range
    public double getRange() {
        if (battery) {
            return this.range - 5;
        } else {
            return this.range;
        }
    }

    // set battery type
    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    // get battery type
    public boolean getBattery() {
        return this.battery;
    }

    // get mpg
    // overrides the super getMPG method
    @Override
    public double getMPG() {
        return super.getMPG() * 0;
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (battery) {
            return super.getSpeed() + 50;
        } else {
            return super.getSpeed();
        }
    }

    // get cargo weight
    // overrides the super getCargoWeight method
    @Override
    public double getCargoWeight() {
        if (battery) {
            return super.getCargoWeight() + 25;
        } else {
            return super.getCargoWeight();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Fuel Cell: \t\t" + this.getFuelCell() + "\n" +
                "Range (mi): \t" + this.getRange() + "\n";
    }
}
