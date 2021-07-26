public class Dog extends Animal{

    public Dog(){}
    public Dog(String nameAnimal, String color, int age){
        super(nameAnimal, color, age);
    }

    @Override
    public void eating() {
        System.out.println(getNameAnimal() + " of color " + getColor() + " is eating.");
    }

    @Override
    public void sleeping() {
        System.out.println(getNameAnimal() + " is sleeping");
    }

    @Override
    public void running() {
        System.out.println(getNameAnimal() + " is running");
    }

    @Override
    public String toString() {
        return "Dog " + this.getNameAnimal();
    }
}
