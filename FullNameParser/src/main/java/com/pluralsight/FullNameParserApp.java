package com.pluralsight;
import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name. (first last or first middle last");
        String fullName = scan.nextLine();

        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0].trim();
        System.out.println("First name is " + firstName);

        if(nameParts.length > 2) {
            String middleName = nameParts[1].trim();
            System.out.println("Middle name is " + middleName);

            String lastName = nameParts[2].trim();
            System.out.println("Last name is " + lastName);

        } else {
            System.out.println("Middle Name (none)");
            String lastName = nameParts[1].trim();
            System.out.println("Last name is " + lastName);
        }



    }
}
