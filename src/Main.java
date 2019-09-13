import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Ana", "a@a.es", "Oncology");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");
        myDoctor.addAvailableAppointment(new Date(), "8am");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient alejandra = new Patient("Alejandra", "a@a.com");
        alejandra.setWeight(66.5);
        alejandra.setPhoneNumber("123456789");
        alejandra.setPhoneNumber("12345678");
        alejandra.setBirthday("19/01/1987");
        alejandra.setHeight(1.85);
        alejandra.setBlood("A+");

        System.out.println(alejandra);
    }


}





