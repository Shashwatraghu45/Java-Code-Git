package raghu;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("sankalp");
            case 2 -> System.out.println("prabhat");
            case 3 -> {
                System.out.println("emp3");
                switch (department) {
                    case "it" -> System.out.println("IT Department");
                    case "sd" -> System.out.println("software Department");
                    case "td" -> System.out.println("Technical Department");
                }
            }
            default -> System.out.println("Enter valid empId or Department");
        }
    }
}
