public class Dog extends Animal{

    public Dog(){}
    public Dog(String nameAnimal){
        super(nameAnimal);
    }

    @Override
    public void eating() {
        System.out.println(getNameAnimal() + " is eating.");
    }

    @Override
    public String toString() {
        return "Dog " + this.getNameAnimal();
    }
}
