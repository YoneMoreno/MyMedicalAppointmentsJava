import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Ana", "Oncology");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        myDoctor.addAvailableAppointment(new Date(), "8am");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        /*
        myDoctor.showName();
        myDoctor.showSpeciality();
        myDoctor.showId();

        Patient alejandra = new Patient("Alejandra", "a@a.com");
        alejandra.setWeight(66.5);
        System.out.println(alejandra.getName() + " weight is: " + alejandra.getWeight());

        alejandra.setPhoneNumber("123456789");
        alejandra.setPhoneNumber("12345678");
        System.out.println(alejandra.getPhoneNumber());

        showMenu();
        */
    }


}





