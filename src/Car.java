// Car Class inherits from Vehicle Class
public class Car extends Vehicle {
    // set up variables
    int wheels = 4;
    String color = "White";
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    // class constructor - default
    public Car() {
        super("", 0, 0, 0);
        this.mpg = 0;
    }

    // class constructor - alternate
    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo,
               double inMPG) {
        super(inBrand, inSpeed, inPassengers, inCargo); // uses the super constructor
        this.mpg = inMPG; // also include the extra variable in the Car constructor
    }

    // set spoiler
    public void setSpoiler(boolean inSpoiler) {
        spoiler = inSpoiler;
    }

    // get spoiler
    public boolean getSpoiler() {
        return spoiler;
    }

    // set stereo
    public void setStereo(boolean inStereo) {
        stereo = inStereo;
    }

    // get stereo
    public boolean getStereo() {
        return stereo;
    }

    // get speed
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler) {
            return super.getSpeed() + 20;
        } else {
            return super.getSpeed();
        }
    }

    // set mpg
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    // get mpg
    public double getMPG() {
        if (stereo) {
            return mpg - (mpg / 10);
        } else {
            return mpg;
        }
    }

    // toString method
    // uses the super toString, as well as adding the new variable to it.
    public String toString() {
        String result = super.toString() + "MPG :\t\t\t" + this.getMPG();
        return result;
    }
}






