public class Doctor {
    static int nextValidId;
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Building Doctor object");
        nextValidId++;
        id = nextValidId;
    }

    Doctor(String name){
        System.out.println("The assigned name for the Doctor is " + name);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor's ID: "+ id);
    }
}
