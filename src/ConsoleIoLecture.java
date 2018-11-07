import java.util.Scanner;

public class ConsoleIoLecture {

    public static void main(String[] args) {

        // ================================== print() and println()

        // this:
//         System.out.println("here");
//         System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print(" ");
//            System.out.print("there");

        // to concatenate, just like JS:
//            String place = "World";
//            System.out.println("Hello" + " " + place);






        // ================================== printf() / .format()


        // Print a formatted string using the following... printf(formatString, data)

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");


        // creating a string variable:

//        String bigBall = "World";
//        System.out.printf("Hello %s", bigBall);



        // multiple variables:

//        int three = 3;
//
//        String petGroup = "cats";
//        System.out.printf("I have %d %s", three, petGroup);
//


        // currency:

//        int currencyPennies = 1000;
//        System.out.printf("I'll sell you swamp land for $%.2f", (currencyPennies / 100.00));


        // ================================== USER INPUT

//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next();
//        String userInput2 = sc.next();
//        System.out.println(userInput);
//        System.out.println(userInput2);


        // .next() captures each input separated by a string:

//        System.out.println("Please enter your first, middle, and last name");
//
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//
//        System.out.println("Your name is " + firstName + " " + middleName + " " + lastName);




        // .nextInt() captures the first valid int value:
//        System.out.println("How old are you?");
//
//        int age = Integer.parseInt(sc.next()); // or .nextInt()
//        System.out.println(age);

        // .nextLine():

//        System.out.println("Enter your favorite quote!");
//        String quote = sc.nextLine();
//        System.out.println("Your quote is... " + quote);




        // Quirk of using next() then nextLine()...
        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

         Scanner sc = new Scanner(System.in);
         System.out.print("Please enter your favorite number: ");
         int num = sc.nextInt();
         System.out.println(num);
         sc.nextLine();
         System.out.print("Please enter your favorite words: ");
         String words = sc.nextLine();
         System.out.println(words);


    }

}
