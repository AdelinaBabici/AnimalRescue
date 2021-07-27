public class Dog extends Animal{

    public Dog(){}
    public Dog(String nameAnimal, String color, int age, int weight){
        super(nameAnimal, color, age, weight);
    }

    @Override
    public void speak() {
        System.out.println(getNameAnimal() + " barks");
    }

    @Override
    public void eat(DogFood dogFood) {
        int weight = getWeight() + 5;
        int hungerLvl = getHungerLvl() -2;
        int healthLvl = getHealthLvl() + 10;
        int wellnessLvl = getWellnessLvl() +20;
        System.out.println(getNameAnimal() + " of color " + getColor() + " is eating "+ dogFood.getQuantity()+ " " +  dogFood.getNameFood() + " and his weight is now= " + weight + " hunger level is " + hungerLvl + " wellness level is " + wellnessLvl + " and health level is " + healthLvl);
    }

    @Override
    public void sleep() {
        System.out.print(" catelul se culca");
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {
        System.out.println(getNameAnimal() + " is running");
    }

    @Override
    public String toString() {
        return "Dog " + this.getNameAnimal();
    }
}
