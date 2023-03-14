// Boat Class inherits from Vehicle Class
public class Boat extends Vehicle {
    // set up variables
    String material = ""; // has an extra variable, material
    // steel, aluminium, wood, fibre-reinforced plastic (FRP), and polyethylene
    double knots = 0.0; // has an extra variable, knots
    boolean paddle = false; // has a modifier, paddle
    boolean sail = false; // has a modifier, sail
    boolean machinery = false; // has a modifier, machinery
    double nmpg = 0.0; // has an extra variable, nmpg

    // class constructor - default
    public Boat() {
        super("", 0.0, 0, 0.0);
        this.material = "";
        this.knots = 0.0;
        this.nmpg = 0.0;
    }

    // class constructor - alternate
    public Boat(String brand, double speed, int passengers, double cargo,
                String material, double nmpg) {
        super(brand, speed, passengers, cargo); // uses the super constructor
        this.material = material; // also include the extra variable in the Boat constructor
        this.knots = 0.0; // also include the extra variable in the Boat constructor
        this.nmpg = nmpg; // also include the extra variable in the Boat constructor
    }

    // set material
    public void setMaterial(String material) {
        this.material = material;
    }

    // get material
    public String getMaterial() {
        return this.material;
    }

    // set knots
    public void setKnots(double knots) {
        this.knots = knots;
    }

    // get knots
    public double getKnots() {
        // knots * 1.151 = mph
        // knots = mph/1.151;
        return getSpeed() / 1.151;
    }

    // set paddle
    public void setPaddle(boolean paddle) {
        this.paddle = paddle;
    }

    // get paddle
    public boolean getPaddle() {
        return this.paddle;
    }

    // set sail
    public void setSail(boolean sail) {
        this.sail = sail;
    }

    // get sail
    public boolean getSail() {
        return this.sail;
    }

    // set machinery
    public void setMachinery(boolean machinery) {
        this.machinery = machinery;
    }

    // get machinery
    public boolean getMachinery() {
        return this.machinery;
    }

    // set nmpg
    public void setNMPG(double nmpg) {
        this.nmpg = nmpg;
    }

    // get nmpg
    public double getNMPG() {
        if (paddle) {
            return this.nmpg * 0;
        } else if (sail) {
            return this.nmpg - (this.nmpg / 10);
        } else if (machinery) {
            return this.nmpg + (this.nmpg / 2);
        } else {
            return this.nmpg;
        }
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (paddle) {
            return super.getSpeed() + 5;
        } else if (sail) {
            return super.getSpeed() + 20;
        } else if (machinery) {
            return super.getSpeed() + 50;
        } else {
            return super.getSpeed();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variables to it
    public String toString() {
        return super.toString() + "Material: \t\t" + this.getMaterial() + "\n" +
                                  "Speed (nmh): \t" + String.format("%.2f", this.getKnots()) + "\n" +
                                  "NMPG: \t\t\t" + this.getNMPG() + "\n";
    }
}
