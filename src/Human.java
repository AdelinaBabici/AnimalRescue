public abstract class Human {

    private String namePerson;

    public Human(String namePerson){
        this.namePerson = namePerson;
    }

    public Human() {

    }

    public abstract void isHappy();
    public abstract void enter();

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}
