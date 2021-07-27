public class Person extends Human {

    private int amount;

    public Person(String namePerson) {
        super(namePerson);
    }
    public Person(){
        super();
    }

    public void adopts(){
        System.out.println("Fetita l-a adoptat si i-a pus un nume frumos.");
    }

    @Override
    public void enter() {
        System.out.println(getNamePerson() + " is entering");
    }

    @Override
    public void isHappy() {
        System.out.println(getNamePerson() + " is being happy about adoption");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "namePerson='" + getNamePerson() + '\'' +
                ", amount=" + amount +
                '}';
    }
}
