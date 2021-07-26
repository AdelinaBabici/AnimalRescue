public class Person extends Human {

    private int amount;

    public Person(String namePerson) {
        super(namePerson);
    }
    public Person(){
        super();
    }


    @Override
    public void beingHappy() {
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
