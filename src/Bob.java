import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean willContinue = true;
        do {
            System.out.println("Say something to Bob!");
            String userQuery = sc.nextLine();
            String bobResponse;

            if (userQuery.endsWith("?")) {
                bobResponse = "Sure.";
            } else if (userQuery.endsWith("!")) {
                bobResponse = "Whoa, chill out!";
            } else if (userQuery.equals("")) {
                bobResponse = "Fine. Be that way!";
            } else {
                bobResponse = "Whatever.";
            }

            System.out.println(bobResponse);
            System.out.println("Do you still want to talk to Bob? [yes/no]");
            willContinue = (sc.nextLine().equals("yes"));
        } while (willContinue);


    }
}
