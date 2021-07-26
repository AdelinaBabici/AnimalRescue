import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Dog dog = new Dog();
        Vet vet = new Vet();
    //  Animal animal = new Animal();
      //  Food food = new Food();
        Activity activity = new Activity();
        Game game = new Game();
        DogFood dogFood = new DogFood();

    /*    animal.setNameAnimal("Azor");
        animal.setAge(8);
        animal.setHealthLvl(9);
        animal.setHungerLvl(4);
        animal.setFoodFav("beef");
        animal.setWellnessLvl(8);
        animal.setWellnessLvl(9);*/

        person.setNamePerson("Luiza");
        person.setAmount(20);

    /*    food.setNameFood("meat");
        food.setDateOfExp(LocalDate.of(2021,12,19));
        food.setInStock(true);
        food.setPrice(200);
        food.setQuantity(45);
        System.out.println(food.getDateOfExp());*/

        activity.setNameActivity("running");

        vet.setNamePerson("Ben");
        vet.setSpecialization("Vet");

        dog.setNameAnimal("Azor");
        dog.setColor("Black");
        dog.setAge(4);
        dog.setWellnessLvl(5);
        dog.setHealthLvl(3);
        dog.setFoodFav("soup");
        dog.setWellnessActivity("jumping");
        dog.setWeight(30);
        dog.setHungerLvl(9);

        dogFood.setNameFood("Meatballs");
        dogFood.setDateOfExp(LocalDate.of(2021,12,19));
        dogFood.setInStock(true);
        dogFood.setPrice(30);
        dogFood.setQuantity(40);

        dog.eating(dogFood);


        game.setDog(dog);
        System.out.println(game.getDog());
        game.setPerson(person);
        game.setVet(vet);
        System.out.println(game.toString());

      //  System.out.println(animal.getNameAnimal() + " are " + animal.getAge() + " ani");

        dog.setNameAnimal("Rex");
        dog.setColor("Brown");

        dog.sleeping();
        dog.running();

      vet.beingHappy();
      vet.treating();

      person.beingHappy();

    }
}
