import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int nextValidId;
    int id;
    String name;
    String email;
    String speciality;

    Doctor(){
        System.out.println("Building Doctor object");
        nextValidId++;
        id = nextValidId;
    }

    Doctor(String name, String speciality){
        System.out.println("Building Doctor object");
        nextValidId++;
        id = nextValidId;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showSpeciality(){
        System.out.println(speciality);
    }

    public void showId(){
        System.out.println("Doctor's ID: "+ id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
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
    }
}






