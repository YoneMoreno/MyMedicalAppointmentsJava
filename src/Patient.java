public class Patient extends User {

    private String birthday;
    private String blood;
    private double weight;
    private double height;

    Patient(String name, String email){
        super(name,email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + " Kg.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return height + " m.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBirthday: " + birthday +
                                    "\nWeight: " + weight +
                                    "\nHeight: " + height +
                                    "\nBlood: " + blood;
    }
}
