public abstract class Animal {

    private String nameAnimal;
    private int age;
    private int healthLvl;
    private int hungerLvl;
    private int wellnessLvl;
    private String foodFav;
    private String wellnessActivity;

    private int weight;
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
    public Animal(String nameAnimal, String color, int age){
        this.nameAnimal = nameAnimal;
        this.color  = color;
        this.age = age;
    }
    public abstract void eating();
    public abstract void sleeping();
    public abstract void running();
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
