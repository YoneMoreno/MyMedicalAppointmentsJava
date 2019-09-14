package ui;

import java.util.Scanner;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\nWelcome patient: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book a new appointent");
            System.out.println("2. See my appointments");
            System.out.println("0. Logout");

            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
            }

        }while(response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book your new appointment!");
            System.out.println("::Please choose a date: ");
        }while(response!=0);
    }
}
