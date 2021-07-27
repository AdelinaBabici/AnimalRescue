public abstract class Animal {

    private String nameAnimal;
    private int age;
    private int healthLvl;
    private int hungerLvl;
    protected int wellnessLvl;
    private String foodFav;
    private String wellnessActivity;

    protected int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(){

    }
    public Animal(String nameAnimal, String color, int age, int weight){
        this.nameAnimal = nameAnimal;
        this.color  = color;
        this.age = age;
        this.weight = weight;
    }
    public abstract void eat(DogFood dogFood);
    public abstract void eat();
    public abstract void sleep();
    public abstract void run();
    public abstract void speak();

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLvl() {
        return healthLvl;
    }

    public void setHealthLvl(int healthLvl) {
        this.healthLvl = healthLvl;
    }

    public int getHungerLvl() {
        return hungerLvl;
    }

    public void setHungerLvl(int hungerLvl) {
        this.hungerLvl = hungerLvl;
    }

    public int getWellnessLvl() {
        return wellnessLvl;
    }

    public void setWellnessLvl(int wellnessLvl) {
        this.wellnessLvl = wellnessLvl;
    }

    public String getFoodFav() {
        return foodFav;
    }

    public void setFoodFav(String foodFav) {
        this.foodFav = foodFav;
    }

    public String getWellnessActivity() {
        return wellnessActivity;
    }

    public void setWellnessActivity(String wellnessActivity) {
        this.wellnessActivity = wellnessActivity;
    }


}
