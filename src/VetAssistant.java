public class VetAssistant extends Vet {
    private String attitude;

    public VetAssistant(String nameVet, String specialization) {
        super(nameVet, specialization);
    }

    public VetAssistant() {
    }

    public void pet(){
        System.out.print("il mangaia");
    }
    public void comfort(){
        System.out.print(" il alinta");
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }
}
