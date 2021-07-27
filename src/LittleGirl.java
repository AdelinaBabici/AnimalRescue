public class LittleGirl extends Person{
    private int age;
    private String hairColor;
    private String loveAnimals;

    public LittleGirl(String namePerson) {
        super(namePerson);
    }

    public LittleGirl() {
    }

    public void playWithDog(){
        System.out.print("fetita se juca cu mingea cu el in gradina ");
    }
    public void fallInLove(){

        System.out.print(" Fetita s-a indragostit de un catel ");
    }
    public void feedTheDog(){
        System.out.print("il hranea cu mancare pentru catei.");
    }

    public void takeDogToVet(){
        System.out.print("Intr-o zi fetita l-a dus la veterniar, care ");
    }
    public void takeForAWalk(){
        System.out.print(" il scotea la plimbare ");
    }
    public void doHomework(){
        System.out.print(", fetita facea teme");
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getLoveAnimals() {
        return loveAnimals;
    }

    public void setLoveAnimals(String loveAnimals) {
        this.loveAnimals = loveAnimals;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void wantsToAdopt(){

    }
    @Override
    public void adopts() {
        super.adopts();
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public void isHappy() {
        super.isHappy();
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
