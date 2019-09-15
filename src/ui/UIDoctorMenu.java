package ui;

import model.AppointmentDoctor;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

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
                    showScheduledAppointments();
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
                System.out.println("You have selected the date: " + date + "\n1. Correct " + "\n2. Change date");
                int responseDate = Integer.parseInt(scanner.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Please write the available time for date: " + date + " [hh:mm]");
                    time = scanner.nextLine();
                    System.out.println("You have chosen the time: " + time + "\n1. Correct " + "\n2. Change the time");
                    responseTime = Integer.parseInt(scanner.nextLine());
                }while(responseTime==2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            }else if(response == 0){
                showDoctorMenu();
            }

        }while(response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if(doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }

    private static void showScheduledAppointments(){
        int numberOfAppointments = 0;
        for (Patient patient : UIMenu.patients) {
            for (AppointmentDoctor appointmentDoctor : patient.getAppointmentDoctors()) {
                if(appointmentDoctor.getDoctor() == UIMenu.doctorLogged){
                    numberOfAppointments++;
                    System.out.println(numberOfAppointments + ". " +
                            "Appointment with patient: " + patient.getName() +
                            "\nDate: " + appointmentDoctor.getDate() +
                            "Time: " + appointmentDoctor.getTime());
                }
            }
        }
        if(numberOfAppointments == 0){
            System.out.println(UIMenu.doctorLogged.getName() + " you don't have appointments!");
        }
    }
}
