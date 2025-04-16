package com.pluralsight;
import java.util.Scanner;
import java.util.ArrayList;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> fullNameList = new ArrayList<String>();

        System.out.println("Please enter your name.");
        System.out.println("First name: ");
        String firstName = scan.nextLine();

        System.out.println("Middle name: ");
        String middleName = scan.nextLine();

        System.out.println("Last name: ");
        String lastName = scan.nextLine();

        System.out.println("Suffix: ");
        String suffix = scan.nextLine();

        //Add first name
        fullNameList.add(firstName);

        //Checks middle name and adds if applicable
        if(!middleName.isEmpty()) {
            fullNameList.add(middleName);
        }


        if(!suffix.isEmpty()) {
            //Adds lastname
            fullNameList.add(lastName + ",");

            fullNameList.add(suffix);
        } else {
            //Adds lastname
            fullNameList.add(lastName);
        }

        StringBuilder sb = new StringBuilder();
        for(String s : fullNameList) {
            sb.append(s);
            sb.append(" ");
        }

        String fullName = sb.toString();
        System.out.println(fullName);

    }
}
