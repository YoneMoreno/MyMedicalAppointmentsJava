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
}
