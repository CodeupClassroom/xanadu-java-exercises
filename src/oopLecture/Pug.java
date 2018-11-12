package oopLecture;

public class Pug {

    public static int numberOfPugs;
    public static double averageLifeExpectancy;
    public static String species = "Canine";

    private String name = "Some Pug";
    private int age;
    private boolean isCute;
    private char gender;


    public Pug() {
    }

    public Pug(String name, int age, boolean isCute, char gender) {
        this.name = name;
        this.age = age;
        this.isCute = isCute;
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCute() {
        return isCute;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static String animal = "Dog";

    public void call() {
        System.out.println("Come here " + name);
    }

    public static void grunt() {
        System.out.println("Oink oink");
    }

    public static void main(String[] args) {
        Pug pg = new Pug("Lexie", 3, true, 'f');
        pg.name = "Lexie";
        pg.age = 3;
        pg.isCute = true;
        pg.gender = 'f';

        System.out.println(pg.name);

        Pug pg2 = new Pug();
        pg2.name = "Lexie";
        pg2.age = 5;
        pg2.isCute = false;
        pg2.gender = 'm';

        System.out.println(pg2.name);


//        pg.call();
    }


}
