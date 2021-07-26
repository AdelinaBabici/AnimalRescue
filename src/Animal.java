public class Animal {

    private String nameAnimal;
    private int age;
    private int healthLvl;
    private int hungerLvl;
    private int wellnessLvl;
    private String foodFav;
    private String wellnessActivity;

    private Animal(String nameAnimal, int age, int healthLvl, int hungerLvl, int wellnessLvl, String foodFav, String wellnessActivity){
        this.age = age;
        this.nameAnimal = nameAnimal;
        this.healthLvl = healthLvl;
        this.hungerLvl = hungerLvl;
        this.wellnessLvl = wellnessLvl;
        this.foodFav = foodFav;
        this.wellnessActivity = wellnessActivity;
    }

}
