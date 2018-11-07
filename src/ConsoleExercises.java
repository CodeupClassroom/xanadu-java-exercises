import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;

//        String piMessage = String.format("The value of pi is approx %.2f", pi);
//        System.out.println(piMessage);

//        System.out.printf("The value of pi is approx %.2f", pi);

//        System.out.println("Please enter an integer");
//        int userNum = sc.nextInt();
//
//        System.out.println(userNum);

//        System.out.println("Please enter three words: ");
//
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//
//        System.out.printf("%s%n%s%n%s", word1, word2, word3);

Scanner sc = new Scanner(System.in);
//System.out.println("Please enter a sentence: ");
//String sentence = sc.nextLine();
//System.out.println(sentence);

System.out.print("Please enter the length of the Codeup classroom in approx feet: ");

int lengthInFeet = Integer.parseInt(sc.nextLine());

System.out.print("Please enter the width of the Codeup classroom in approx feet: ");

int widthInFeet = Integer.parseInt(sc.nextLine());

int area = lengthInFeet * widthInFeet;
int perimeter = lengthInFeet * 2 + widthInFeet * 2;

String message = String.format("Room area is %d feet and the perimeter is %d feet", area, perimeter);

System.out.println(message);




    }

}
