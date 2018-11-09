import java.util.Arrays;

public class MethodLecture {

    /*
        Defining Methods
        Keywords: public, static, return-type, method-name
        Parameters
        Calling methods
        Using methods:
            as values assigned to variables
            in larger expressions
            calling methods in other methods
            as arguments to other functions
        Method Overloading
        Recursion
        Placement of main methods
    */

//    public static void main(String[] args) {
////        System.out.println(returnFive());
////        String message = returnGreeting("Justin") + " " + niceMessage();
////        System.out.println(message);
//
////        System.out.println(returnTen());
//
////        init();
//
////        System.out.println(message());
////        System.out.println(message(10));
////        System.out.println(message("This is a custom message!"));
////        System.out.println(message("Custom message", "URGENT"));
//
//
//    }


//    public static String message() {
//        return "This is a message";
//    }
//
//    public static String message(String message) {
//        return message;
//    }
//
//    public static String message(String message, String status) {
//        return message + " Status:" + status;
//    }
//
//    public static String message(int code) {
//        return "Code: " + code + " message";
//    }


//    public static void init() {
//        System.out.println(returnTen());
//        System.out.println();
//        System.out.println(returnGreeting("Ronald"));
//    }

//    public static int returnNum(int num) {
//        return num;
//    }
//
//    public static int returnFive() {
//        return 5;
//    }
//
//    public static int returnTen() {
//        return returnFive() + returnFive();
//    }
//
//    public static String returnGreeting(String name) {
//        return String.format("Hello, %s.", name);
//    }
//
//    public static String niceMessage() {
//        return "You are great!";
//    }


//    public static void main(String[] args) {
////        countDownNumsLoop(10);
//        countDownNums(10);
//    }
//
//    public static void countDownNumsLoop(int num) {
//        for (int i = num; i > 0; i -= 1) {
//            System.out.println(i);
//        }
//        System.out.println("Finished!");
//    }
//
//    // recursion
//    public static int countDownNums(int num) {
//        if (num == 0) {
//            System.out.println("Finished!");
//            return 0;
//        }
//        System.out.println(num);
//        return countDownNums(num - 1);
//    }

//    public static void main(String[] args) {
//        String[] test = {"Hello", "Cat", "Rat"};
//        String[] arrCopy = Arrays.copyOf(test, test.length);
//        changeArr(arrCopy);
//        System.out.println(test[0]);
//    }
//
//    public static void changeArr(String[] arr) {
//        arr[0] = "Tap";
//    }

}
