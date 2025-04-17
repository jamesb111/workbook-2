package com.pluralsight;
import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String inputName = scan.nextLine();

        //----------Billing-----------------------------
        System.out.println("Insert Billing Address");
        System.out.println("Address street?");
        String billStreet = scan.nextLine();

        System.out.println("City name?");
        String billCity = scan.nextLine();

        System.out.println("State name?");
        String billState = scan.nextLine();

        System.out.println("What is your zip code?");
        String billZip = scan.nextLine();
        String billAddress = "Billing Address: ";

        //===========Shipping=====================================
        System.out.println("-------------------------------");

        System.out.println("Insert Shipping Address?");
        System.out.println("Address street?");
        String shipStreet = scan.nextLine();

        System.out.println("City name?");
        String shipCity = scan.nextLine();

        System.out.println("State name?");
        String shipState = scan.nextLine();

        System.out.println("What is your zip code?");
        String shipZip = scan.nextLine();
        String shipAddress = "Shipping Adress: ";


        addressFormatter(billAddress, inputName, billStreet, billCity, billState, billZip);
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        addressFormatter(shipAddress, inputName, shipStreet, shipCity, shipState, shipZip);
    }
    static void addressFormatter(String adType, String name, String street, String city, String state, String zip) {
        StringBuilder fullAddy = new StringBuilder();
        fullAddy.append(adType).append("\n");
        fullAddy.append(name).append("\n");
        fullAddy.append(street).append("\n");
        fullAddy.append(city).append(" ");
        fullAddy.append(state).append(", ");
        fullAddy.append(zip);

        String realAddress = fullAddy.toString();

        System.out.println(realAddress);

    }
}
