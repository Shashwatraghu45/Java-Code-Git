package Functions;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "how are you";
        return greeting;
    }
}
