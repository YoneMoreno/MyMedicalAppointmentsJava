package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\nWelcome doctor: " + UIMenu.doctorLogged.getName());

            System.out.println("1. Add available appointment");
            System.out.println("2. Show scheduled appointments");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
            }

        }while(response != 0);
    }

    private static void showAddAvailableAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("\n::Add available appointment");
            System.out.println(":: Choose a month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.parseInt(scanner.nextLine());

            if(response > 0 && response < 4){
                int monthSelected = response;
                System.out.println("You have chosen month: " + monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Write the available date: [dd/mm/yyyy]");
                String date = scanner.nextLine();
                System.out.println("You have selected the date: " + date +
                        "\n1. Correct " +
                        "\n2. Change date");

            }else if(response == 0){
                showDoctorMenu();
            }

        }while(response != 0);
    }
}
