package raghu;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("Yellow");
            case "banana" -> System.out.println("yellow");
            case "orange" -> System.out.println("orange");
            default -> System.out.println("enter a valid fruit");
        }
    }
}
