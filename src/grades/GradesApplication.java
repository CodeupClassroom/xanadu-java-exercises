package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = getStudents();

        System.out.println(students);

    }

    public static HashMap<String, Student> getStudents() {
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Fred");
        Student s2 = new Student("Sally");
        Student s3 = new Student("Lisa");
        Student s4 = new Student("Kyle");

        s1.addGrade(80);
        s1.addGrade(100);
        s1.addGrade(90);

        s2.addGrade(80);
        s2.addGrade(100);
        s2.addGrade(90);

        s3.addGrade(80);
        s3.addGrade(100);
        s3.addGrade(90);

        s4.addGrade(80);
        s4.addGrade(100);
        s4.addGrade(90);

        students.put("fred5", s1);
        students.put("sally5", s2);
        students.put("lisa5", s3);
        students.put("kyle5", s4);

        return students;
    }

}
