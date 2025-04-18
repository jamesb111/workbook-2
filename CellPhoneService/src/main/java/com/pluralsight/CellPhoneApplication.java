package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CellPhone jayPhone = new CellPhone();

        System.out.println("What is the Serial Number?");
        String serialNum = scan.nextLine();

        System.out.println("What is the Phone Model?");
        String model = scan.nextLine();

        System.out.println("Who is the phone carrier?");
        String carrier = scan.nextLine();

        System.out.println("What is the phone number?");
        String phoneNum = scan.nextLine();

        System.out.println("Who is the phone owner?");
        String owner = scan.nextLine();

        jayPhone.setSerialNumber(Integer.parseInt(serialNum));
        jayPhone.setModel(model);
        jayPhone.setCarrier(carrier);
        jayPhone.setPhoneNumber(phoneNum);
        jayPhone.setOwner(owner);

        System.out.println("Serial Numbers is: " + jayPhone.getCarrier() + "\n" +
                "Phone Model is: " + jayPhone.getModel() + "\n" +
                "Phone carrier is: " + jayPhone.getCarrier() + "\n" +
                "Phone number is: " + jayPhone.getPhoneNumber() + "\n" +
                "Phone owner is: " + jayPhone.getOwner());

    }
}
