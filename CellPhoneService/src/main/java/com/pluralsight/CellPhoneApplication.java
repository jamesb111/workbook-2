package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // first phone
        CellPhone jayPhone = new CellPhone();
        
        //scanner inputs for first phone
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

        //setting scanner inputs to the properties of the first phone instance
        jayPhone.setSerialNumber(Integer.parseInt(serialNum));
        jayPhone.setModel(model);
        jayPhone.setCarrier(carrier);
        jayPhone.setPhoneNumber(phoneNum);
        jayPhone.setOwner(owner);

        // printing first phone properties
        System.out.println("Serial Numbers is: " + jayPhone.getCarrier() + "\n" +
                "Phone Model is: " + jayPhone.getModel() + "\n" +
                "Phone carrier is: " + jayPhone.getCarrier() + "\n" +
                "Phone number is: " + jayPhone.getPhoneNumber() + "\n" +
                "Phone owner is: " + jayPhone.getOwner());

        // Second phone setup------------------------------
        CellPhone randomPhone = new CellPhone();
        String ranSN = "10190913";
        String ranModel = "Galaxy s3";
        String ranCarrier = "T-Mobile";
        String ranPhoneNum = "5867802323";
        String ranOwner = "Silly Billy";

        randomPhone.setSerialNumber(Integer.parseInt(ranSN));
        randomPhone.setModel(ranModel);
        randomPhone.setCarrier(ranCarrier);
        randomPhone.setPhoneNumber(ranPhoneNum);
        randomPhone.setOwner(ranOwner);
        //end of setup-------------------------

        //printing static display method and dial mehtod
        System.out.println("---------------------------");
        display(jayPhone);
        display(randomPhone);
        System.out.println("---------------------------");
        jayPhone.dial(randomPhone.getPhoneNumber());

    }

    static void display(CellPhone phone) {
        System.out.println(phone.getOwner() + " has a " + phone.getModel() + " from " + phone.getCarrier()
        + " the phone number is " + phone.getPhoneNumber() + " and the serial number is " + phone.getSerialNumber());
    }

}
