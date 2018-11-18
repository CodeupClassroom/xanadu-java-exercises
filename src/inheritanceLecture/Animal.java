package inheritanceLecture;

public class Animal {

    private String preferredClimate;
    private int numberOfLegs;


    public Animal(String preferredClimate, int numberOfLegs) {
        this.preferredClimate = preferredClimate;
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getAnimalInfo() {
        return String.format("This animal thrives in %s areas and has %d legs", preferredClimate, numberOfLegs);
    }

}
