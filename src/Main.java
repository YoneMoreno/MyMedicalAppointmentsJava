import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Ana", "Oncology");
        myDoctor.showName();
        myDoctor.showSpeciality();
        myDoctor.showId();

        Patient alejandra = new Patient("Alejandra", "a@a.com");


        showMenu();
    }


}





