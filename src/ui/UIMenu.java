package ui;

import model.Doctor;
import model.Patient;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

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
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    authUser(2);
                    response = 0;
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
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i-1]);
                    }
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

    private static void authUser(int userType){
        /*
        userType = 1, Doctor
        userType = 2, Patient
         */

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro","alejandro@mail.com"));
        doctors.add(new Doctor("Karen","karen@mail.com"));
        doctors.add(new Doctor("Rocio","rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahi","anahi@mail.com"));
        patients.add(new Patient("Roberto","roberto@mail.com"));
        patients.add(new Patient("Carlos","carlos@mail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Type your email: [a@mail.com]");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();

            if(userType == 1){
                for (Doctor doctor: doctors){
                    if(email.equals(doctor.getEmail())){
                        emailCorrect = true;
                        doctorLogged = doctor;
                        //showDoctorMenu
                    }
                }
            }

            if(userType == 2){
                for (Patient patient: patients){
                    if(email.equals(patient.getEmail())){
                        emailCorrect = true;
                        patientLogged = patient;
                        //showPatientMenu
                    }
                }
            }

        }while (!emailCorrect);

    }

}
