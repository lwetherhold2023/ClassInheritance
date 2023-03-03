// Electric Class inherits from Car Class
public class Electric extends Car {
    // set up variables
    String battery = ""; // has an extra variable, battery
    // Lithium-ion, Nickel-metal hydride, Lead-acid, and Ultracapacitor
    double range = 0; // has an extra variable, range

    // class constructor - default
    public Electric() {
        super("", 0.0, 0, 0.0, "", 0, 0.0);
        this.battery = "";
        this.range = 0.0;
    }

    // class constructor - alternate
    public Electric(String brand, double speed, int passengers, double cargo,
                    String color, int wheels, double mpg,
                    String battery, double range) {
        super(brand, speed, passengers, cargo, color, wheels, mpg); // uses the super constructor
        this.battery = battery; // also include the extra variable in the Electric constructor
        this.range = range; // also include the extra variable in the Electric constructor
    }

    // set battery type
    public void setBattery(String battery) {
        this.battery = battery;
    }

    // get battery type
    public String getBattery() {
        return this.battery;
    }

    // set range
    public void setRange(double range) {
        this.range = range;
    }

    // get range
    public double getRange() {
        return this.range;
    }

    // get mpg
    // overrides the super getMPG method
    @Override
    public double getMPG() {
        return super.getMPG() * 0;
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Battery: \t\t" + this.getBattery() + "\n" +
                                  "Range (mi): \t" + this.getRange() + "\n";
    }
}
