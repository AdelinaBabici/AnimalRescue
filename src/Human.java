public abstract class Human {

    private String namePerson;
    public Human(String namePerson){
        this.namePerson = namePerson;
    }

    public Human() {

    }

    public abstract void beingHappy();
    public abstract void dancing();

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}
