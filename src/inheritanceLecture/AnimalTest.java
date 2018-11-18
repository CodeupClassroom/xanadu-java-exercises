package inheritanceLecture;

public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Animal("Sky", 2);
        Dog d = new Dog("My couch", 4, "pug");
        displayAnimalInfo(d);
    }

    public static void displayAnimalInfo(Animal animal) {
        System.out.println(animal.getAnimalInfo());
    }
}
