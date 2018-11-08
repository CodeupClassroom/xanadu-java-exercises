import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================ Problem 1
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);


        // ================ FizzBuzz

        // Write a program that prints the numbers from 1 to 100.
        // For multiples of three print “Fizz” instead of the number
        // For the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int i = 1; i <= 100; i += 1) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        // ================ Display a table of powers.

        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        // Ask if the user wants to continue.
        // Assume that the user will enter valid data.
        // Only continue if the user agrees to.

        /*

            What number would you like to go up to? 5

            Here is your table!

            number | squared | cubed
            ------ | ------- | -----
            1      | 1       | 1
            2      | 4       | 8
            3      | 9       | 27
            4      | 16      | 64
            5      | 25      | 125

         */

        System.out.print("Please enter an integer: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("\nHere is your table!\n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= number; i += 1 ) {
            System.out.printf("%-6d | %-7d | %-5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));


        // ================ Convert given number grades into letter grades.

        // Prompt the user for a numerical grade from 0 to 100.
        // Display the corresponding letter grade.
        // Prompt the user to continue.
        // Assume that the user will enter valid integers for the grades.
        // The application should only continue if the user agrees to.
        // Grade Ranges:
        //
        // A : 100 - 88
        // B : 87 - 80
        // C : 79 - 67
        // D : 66 - 60
        // F : 59 - 0

        boolean userContinues = true;
        do {
            System.out.print("Please enter a number grade from 0 to 100: ");
            int numberGrade = sc.nextInt();
            String letterGrade = "";
            if (numberGrade >= 88) {
                letterGrade = "A";
            } else if (numberGrade >= 80) {
                letterGrade = "B";
            } else if (numberGrade >= 67) {
                letterGrade = "C";
            } else if (numberGrade >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }
            System.out.println("\n" + letterGrade + "\n");
            System.out.print("Will you continue? Please enter yes or no: ");
            sc.nextLine();
            String answer = sc.next();
            if (!answer.equals("yes")) {
                userContinues = false;
            }
        } while (userContinues);





    }

}
