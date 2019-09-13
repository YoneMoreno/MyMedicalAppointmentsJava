import model.Doctor;
import model.Nurse;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        User userDoctor = new Doctor("Bob","bob@b.com");
        userDoctor.showUserData();

        User userPatient = new Patient("Pepe","p@p.es");
        userPatient.showUserData();

        User userNurse = new Nurse("Estebana","e@e.net");
        userNurse.showUserData();

        User anonymousUser = new User("Anonimo","a@a.com") {
            @Override
            public void showUserData() {
                System.out.println("Internship doctor");
                System.out.println("Works at the La Paloma Hospital");
                System.out.println("Department of Odontology");
            }
        };
        anonymousUser.showUserData();

        /*
        Doctor myDoctor = new Doctor("Ana", "a@a.es");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        myDoctor.addAvailableAppointment(new Date(), "8am");

        System.out.println(myDoctor);

        Patient alejandra = new Patient("Alejandra", "a@a.com");
        alejandra.setWeight(66.5);
        alejandra.setPhoneNumber("123456789");
        alejandra.setPhoneNumber("12345678");
        alejandra.setBirthday("19/01/1987");
        alejandra.setHeight(1.85);
        alejandra.setBlood("A+");

        System.out.println(alejandra);
        */
    }


}





