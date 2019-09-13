import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;


    Doctor(String name, String email, String speciality){
        super(name,email);
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(super.getName());
    }

    public void showSpeciality(){
        System.out.println(speciality);
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality +
                                    "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\nDate: " + date + "\nTime: " + time;
        }
    }
}






