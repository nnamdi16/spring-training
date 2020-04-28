package spring.autowiredAnnotation.example2;

import java.util.Scanner;

public class Menu {


    @SuppressWarnings("resource")
    public static int displayMenu() {

        // Choice variable
        int val;

        // Display menu
        System.out.println("|=========================================|");
        System.out.println("|   	 AUTOWIRED ANNOTATION DEMO        |");
        System.out.println("|=========================================|");
        System.out.println("|               Options:                  |");
        System.out.println("|        1. Autowired                     |");
        System.out.println("|        2. Autowired with Qualifier      |");
        System.out.println("|=========================================|");

        // User input
        Scanner in = new Scanner(System.in);
        System.out.println("Select option: ");
        val = Integer.valueOf(in.nextLine());

        return val;
    }
}

