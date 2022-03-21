package Conditionals_Loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Hemant Patel");
            case 2 -> System.out.println("Second Employee");
            case 3 -> {
                System.out.println("Third Employee");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "COMP" -> System.out.println("COMP Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter a valid empID");
        }

    }
}
