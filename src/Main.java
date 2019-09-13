import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Ana";
        myDoctor.showName();
        myDoctor.showId();

        Doctor newDoctor = new Doctor();
        newDoctor.showId();
        myDoctor.showId();

        showMenu();
    }


}





