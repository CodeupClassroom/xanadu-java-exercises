package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Map<String, Student> students = getStudents();
        System.out.println("Welcome!");
        Input in = new Input(new Scanner(System.in));
        do {
            processInteraction(students, in);
            System.out.println();
            System.out.println("Would you like to see another student?\n");
        } while(in.yesNo());
    }

    public static void processInteraction(Map<String, Student> students, Input in) {
        System.out.println("\nHere are the GitHub usernames of our students:\n");
        System.out.println(listStudents(students) + "\n");
        System.out.println("What student would you like to see more information on?\n");
        String userChoice = in.getString();
        System.out.println();
        if (students.containsKey(userChoice)) {
            System.out.println(listStudentInfo(students.get(userChoice), userChoice));
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + userChoice + ".");
        }
    }

    public static String listStudentInfo(Student s, String key) {
        return String.format("Name: %s - GitHub UserName: %s%nCurrentAverage: %.2f", s.getName(), key, s.getGradeAverage());
    }

    public static String listStudents(Map<String, Student> mapOfStudents) {
        String output = "";
        for (String key : mapOfStudents.keySet()) {
            output += String.format("|%s| ", key);
        }
        return output.trim();
    }

    public static Map<String, Student> getStudents() {
        Map<String, Student> students = new HashMap<>();

        Student s1 = new Student("Fred");
        s1.addGrade(80);
        s1.addGrade(100);
        s1.addGrade(90);

        Student s2 = new Student("Sally");
        s2.addGrade(100);
        s2.addGrade(95);
        s2.addGrade(100);

        Student s3 = new Student("George");
        s3.addGrade(50);
        s3.addGrade(100);
        s3.addGrade(75);

        Student s4 = new Student("Kyle");
        s4.addGrade(0);
        s4.addGrade(50);
        s4.addGrade(25);

        students.put("fred5", s1);
        students.put("sally5", s2);
        students.put("george5", s3);
        students.put("kyle5", s4);

        return students;
    }

}
