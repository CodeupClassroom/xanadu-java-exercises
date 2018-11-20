package annotationsLecture;

@SuppressWarnings("all")
public class Parent {

    public void say() {
        System.out.println("I am the parent!");
    }

    @Deprecated
    public static void oldMethod() {
        System.out.println("Old way of doing things...");
    }

}
