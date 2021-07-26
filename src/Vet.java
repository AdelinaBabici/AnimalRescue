public class Vet extends Human {
    private String nameVet;
    private String specialization;

public Vet( String nameVet){
   super(nameVet);
}
    public Vet(){
    super();
    }

    public void treating(){
        System.out.println(getNamePerson() + " is treating animals");
    }

    @Override
    public void beingHappy() {
        System.out.println(getNamePerson() + " is being happy");
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return   "nameVet='" + getNamePerson() + '\'' +
                ", specialization='" + specialization + '\''
                ;
    }
}
