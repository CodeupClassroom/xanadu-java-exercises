import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        Person p1 = new Person("Ron");
        Person p2 = new Person("Fred");
        Person p3 = new Person("Sally");

        Person[] people = {p1, p2, p3};
        Person[] morePeople = addPerson(people, new Person("Kevin"));
        System.out.println(Arrays.toString(morePeople));

    }

    public static Person[] addPerson(Person[] personArr, Person p) {
        Person[] personCopy = Arrays.copyOf(personArr, personArr.length + 1);
        personCopy[personCopy.length - 1] = p;
        return personCopy;
    }
}
