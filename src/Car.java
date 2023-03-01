// Car Class inherits from Vehicle Class
public class Car extends Vehicle {
    // set up variables
    String color = ""; // has an extra variable, color
    int wheels = 0; // has an extra variable, wheels
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; // has an extra variable, mpg

    // class constructor - default
    public Car() {
        super("", 0.0, 0, 0.0);
        this.color = "";
        this.wheels = 0;
        this.mpg = 0.0;
    }

    // class constructor - alternate
    public Car(String brand, double speed, int passengers, double cargo,
               String color, int wheels, double mpg) {
        super(brand, speed, passengers, cargo); // uses the super constructor
        this.color = color; // also include the extra variable in the Car constructor
        this.wheels = wheels; // also include the extra variable in the Car constructor
        this.mpg = mpg; // also include the extra variable in the Car constructor
    }

    // set wheels
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // get wheels
    public int getWheels() {
        return this.wheels;
    }

    // set color
    public void setColor(String color) {
        this.color = color;
    }

    // get color
    public String getColor() {
        return this.color;
    }

    // set spoiler
    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    // get spoiler
    public boolean getSpoiler() {
        return this.spoiler;
    }

    // set stereo
    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    // get stereo
    public boolean getStereo() {
        return this.stereo;
    }

    // set mpg
    public void setMPG(double mpg) {
        this.mpg = mpg;
    }

    // get mpg
    public double getMPG() {
        if (stereo) {
            return this.mpg - (this.mpg / 10);
        } else {
            return this.mpg;
        }
    }

    // get speed
    // overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler) {
            return super.getSpeed() + 20;
        } else {
            return super.getSpeed();
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variable to it.
    public String toString() {
        return super.toString() + "Color: \t\t\t" + this.getColor() + "\n" +
                                  "Wheels: \t\t" + this.getWheels() + "\n" +
                                  "MPG: \t\t\t" + this.getMPG() + "\n";
    }
}






