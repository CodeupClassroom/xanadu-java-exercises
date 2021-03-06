package inheritanceLecture;

public class Jet extends Vehicle {

    public int altitude;

    // creating a new constructor
    public Jet(int maxSpeed) {
        super(maxSpeed); // using old constructor
        this.altitude = 0;
    }

    public void eject() {
        System.out.println("I'm getting OUT of here!!!");
    }

    // overriding from parent
    public void turnOn() {
        System.out.println("...igniting jets");
    }

}
