package inheritanceLecture;

public class Dog extends Animal {

    private String breed;

    public Dog(String preferredClimate, int numberOfLegs, String breed) {
        super(preferredClimate, numberOfLegs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAnimalInfo() {
        String output = super.getAnimalInfo();
        output += " and is a " + breed + " breed";
        return output;
    }

}
