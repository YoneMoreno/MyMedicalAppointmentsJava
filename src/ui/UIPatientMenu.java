package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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

            /*
            * [doctors]
            * 1. doctor1
            * 2. doctor2
            *           1. date1
            *           2. date2
            * 3. doctor3
            * */

            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();
            int key = 0;

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {

                ArrayList<Doctor.AvailableAppointment> availableAppointments =
                        UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    key++;
                    System.out.println(key + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(j,UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(key, doctorAppointments);
                }
            }

            Scanner scanner = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(scanner.nextLine());



        }while(response!=0);
    }
}









