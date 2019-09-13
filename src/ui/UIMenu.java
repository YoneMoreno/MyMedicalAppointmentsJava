package ui;

import java.util.Scanner;

public class UIMenu {

    public static void showMenu(){
        System.out.println("Welcome, to my appointments app");
        System.out.println("Choose the desired option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit, bye!");
                    break;
                default:
                    System.out.println("Please select a valid answer");
            }
        }while (response!=0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an Appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch(response){
                case 1:
                    System.out.println("::Book an Appointment");
                    break;
                case 2:
                    System.out.println(":: My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while(response!=0);
    }
}
