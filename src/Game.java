public class Game {

    private Person person;
    private Dog dog;
    private Vet vet;
    public Game(Person person, Dog dog, Vet vet){
        this.person = person;
        this.dog = dog;
        this.vet = vet;
    }
    public Game(){

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    @Override
    public String toString() {
        return "Game " +
                person + " "
              +   dog + " "
               +  vet;
    }
}
