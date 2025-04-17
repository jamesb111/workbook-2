package com.pluralsight;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter format1;

        System.out.println("What is your name?");
        String userName = scan.nextLine();

        String[] nameParts = userName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("What is the date of the show? (MM/DD?YYY)");
        String inputDate = scan.nextLine();
        format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate rezDate = LocalDate.parse(inputDate, format1);


        /*
        String[] dateParts = inputDate.split("/");
        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2]; */


        /* StringBuilder dateMaker = new StringBuilder();
        dateMaker.append(year).append("-");
        dateMaker.append(month).append("-");
        dateMaker.append(day); */

        //String formattedDate = dateMaker.toString();

        // format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //LocalDate rezDate = LocalDate.parse(formattedDate, format1);


       System.out.println("How many tickets will you need?");
        int numOfTickets = scan.nextInt();

        if(numOfTickets > 1) {
            System.out.printf("%d tickets reserved for %tF under %s, %s", numOfTickets, rezDate, lastName, firstName);
        } else {
            System.out.printf("%d ticket reserved for %tF under %s, %s", numOfTickets, rezDate, lastName, firstName);

        }

    }
}
