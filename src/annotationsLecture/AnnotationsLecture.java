package annotationsLecture;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {
    public static int someNum = 3; // WeakerAccess warning
    public static void main(String[] args) {
        doRiskyThings();
    }

    public static void doRiskyThings() {
        Child c = new Child();
        c.oldMethod(); // deprecation and static access

        int a = (int) 2;
        List l = new ArrayList();
        l.add("test"); // unchecked warning
        int three = 3; // unused warning
        System.out.println(l);
        AnnotationsLecture al = new AnnotationsLecture();
        System.out.println(al.someNum); // static-access warning

        String someName = "Fred"; // unused

        if (true) {
            ;
        }

        Boolean test = true; //
        if (test) {
            System.out.println("TRUE!");
        }
    }

}
