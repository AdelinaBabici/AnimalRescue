public class Labrador extends Dog{
    private String stateOfMind;
    private String checkWeight;
    private String desireToEat;
    private int fearLvl;
    private int energyLvl;
    private int treatmentReceived;
    private String race;
    private String weightControl;

    public Labrador() {
    }

    public Labrador(String nameAnimal, String color, int age, int weight) {
        super(nameAnimal, color, age, weight);

    }

    public void balanceLifeStyle(){
        int weight = getWeight() - 15;
        int hungerLvl = 0;
        int healthLvl = 10;
        int wellnessLvl = 10;
        System.out.println("Cu rutina aceasta, fetita a reusit sa ii tina sub control nevoile si greutatea catelului.: "+ "  weight= " + weight + " hunger level= " + hungerLvl + " wellness level = " + wellnessLvl + " and health level = " + healthLvl);
    }
public void wakeUp(){
    System.out.print("Dupa trezire ");
}
    public void play(){
        System.out.println(" sa se joace cu el");
        wellnessLvl = wellnessLvl + 2;
        if(wellnessLvl > 4){
            System.out.println("Catelul a inceput sa fie tot mai sanatos, sa arate tot mai bine.");
        }
    }
    public String getWeightControl() {
        if (weight > 20){
            return "sa ia in greutate";
        }
        return null;
    }

    public void setWeightControl(int weight) {
        this.weightControl = weightControl;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getStateOfMind() {
        return stateOfMind;
    }

    public void setStateOfMind(String stateOfMind) {
        this.stateOfMind = stateOfMind;
    }

    public String getCheckWeight() {
        return checkWeight;
    }

    public void setCheckWeight(String checkWeight) {
        this.checkWeight = checkWeight;
    }

    public String getDesireToEat() {
        return desireToEat;
    }

    public void setDesireToEat(String desireToEat) {
        this.desireToEat = desireToEat;
    }

    public String getFearLvl() {
        if(fearLvl < 5){
            return "calmandu-l";
        }else if(fearLvl > 8){
            return "i-a fost si mai frica.";
        }else{
            return "foarte fricos";
        }

    }

    public void setFearLvl(int fearLvl) {
        this.fearLvl = fearLvl;
    }

    public String getEnergyLvl() {
        if(energyLvl > 6){
            return "a inceput sa se simta mai energic.";
        }
        return null;
    }

    public void setEnergyLvl(int energyLvl) {
        this.energyLvl = energyLvl;
    }

    public int getTreatmentReceived() {
        return treatmentReceived;
    }

    public void setTreatmentReceived(int treatmentReceived) {
        this.treatmentReceived = treatmentReceived;
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getNameAnimal() {
        return super.getNameAnimal();
    }

    @Override
    public void setNameAnimal(String nameAnimal) {
        super.setNameAnimal(nameAnimal);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getHealthLvl() {
        return super.getHealthLvl();
    }

    @Override
    public void setHealthLvl(int healthLvl) {
        super.setHealthLvl(healthLvl);
    }

    @Override
    public int getHungerLvl() {
        return super.getHungerLvl();
    }

    @Override
    public void setHungerLvl(int hungerLvl) {
        super.setHungerLvl(hungerLvl);
    }

    @Override
    public int getWellnessLvl() {
        return super.getWellnessLvl();
    }

    @Override
    public void setWellnessLvl(int wellnessLvl) {
        super.setWellnessLvl(wellnessLvl);
    }

    @Override
    public String getFoodFav() {
        return super.getFoodFav();
    }

    @Override
    public void setFoodFav(String foodFav) {
        super.setFoodFav(foodFav);
    }

    @Override
    public String getWellnessActivity() {
        return super.getWellnessActivity();
    }

    @Override
    public void setWellnessActivity(String wellnessActivity) {
        super.setWellnessActivity(wellnessActivity);
    }

    @Override
    public void eat() {
        System.out.print(" catelul manca din nou");
    }

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void eat(DogFood dogFood) {
        super.eat(dogFood);
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
