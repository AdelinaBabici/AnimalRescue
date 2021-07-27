public class Vet extends Human {
    private String specialization;
public Vet( String nameVet, String specialization){
   super(nameVet); this.specialization = specialization;
}

    public void administerVaccine(){
        System.out.print(" i-a facut vaccinurile periodice");
    }
    public void disinfestation(){
        System.out.print(" si deparazitare.");
    }

    @Override
    public void enter() {
        System.out.println(getNamePerson() + " is entering the room");
    }

    public Vet(){
    super();
    }

    public void treating(){
        System.out.println(getNamePerson() + " is treating animals");
    }

    @Override
    public void isHappy() {
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
