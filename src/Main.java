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

     //   dog.eat(dogFood);


        game.setDog(dog);
   //     System.out.println(game.getDog());
        game.setPerson(person);
        game.setVet(vet);
   //     System.out.println(game.toString());

      //  System.out.println(animal.getNameAnimal() + " are " + animal.getAge() + " ani");

        dog.setNameAnimal("Rex");
        dog.setColor("Brown");

   //     dog.sleep();
  //      dog.run();

  //    vet.isHappy();
  //    vet.treating();

   //   person.isHappy();

//Animal rescue project
        LittleGirl littleGirl = new LittleGirl();
        Father father = new Father();
        Labrador labrador = new Labrador();
        Vet vet1 = new Vet();
        VetAssistant vetAssistant = new VetAssistant();
        WetFood wetFood = new WetFood();
        Desk desk = new Desk();
        Park park = new Park();
        Yard yard = new Yard();
        Vaccine vaccine = new Vaccine();


        littleGirl.setAge(7);
        littleGirl.setHairColor("roscat");
        littleGirl.setLoveAnimals("iubitoare de animale");
        father.setHeight("inalt");
        labrador.setRace("corcitura de labrador");
        labrador.setStateOfMind("foarte nefericit");
        labrador.setCheckWeight("slab");
        labrador.setDesireToEat("nu voia sa manance");
        labrador.setFearLvl(8);
        labrador.setAge(4);
        labrador.setWeight(25);
        labrador.setEnergyLvl(8);
        labrador.setWellnessLvl(3);
        vetAssistant.setAttitude("draguta");
        vetAssistant.setSpecialization("asistenta");
        desk.setColor("alb");
        desk.setFurniture("scaunul de birou");
        desk.setComfortLvLOfFurniture(9);
        desk.setAccessories("lampii");
        park.setType("parcul municipal");
        park.setGreenSpace("multi copaci");
        park.setDecoration("carari.");
        yard.setSize(7);
        yard.setToys(" ursuleti.");
        vaccine.setType("antirabic");
        vaccine.setName("Nobivac® Rabies");
        vaccine.setPharmaceuticalForm("suspensie injectabila");


        System.out.println("Intr-o zi, o fetita mica de " + littleGirl.getAge() + " ani, cu par " + littleGirl.getHairColor() + " si " + littleGirl.getLoveAnimals() + " a intrat impreuna cu tatal ei " + father.getHeight() + "intr-un adapost de animale, pentru a adopta un animal.");
        littleGirl.fallInLove();
        System.out.println(",care era o " + labrador.getRace() + " .");
        System.out.println("Cainele, era " + labrador.getStateOfMind() + " , " + labrador.getCheckWeight() + " si " + labrador.getDesireToEat() + " .");
        littleGirl.adopts();
        System.out.print("Cainele a fost " + labrador.getFearLvl() + " la inceput, asa ca ");
        littleGirl.feedTheDog();
        System.out.println(" Dupa catva timp, catelul, in varsta de " + labrador.getAge() + " ani " + " a inceput " + labrador.getWeightControl() + " si " + labrador.getEnergyLvl());
        System.out.print("Fetita a inceput ");
        labrador.play();
        littleGirl.takeDogToVet();
        vet.administerVaccine();
        System.out.println(" (de exemplu, a primit vaccinul " + vaccine.getType() + " " + vaccine.getName() + " " + vaccine.getPharmaceuticalForm() + ") ");
        vet.disinfestation();
        System.out.println("Catelul a fost " + labrador.getFearLvl() + " si inainte ca acesta sa ii aplice tratamentul medical, dar dupa ce a primit tratamentul, ");
        labrador.setFearLvl(10);
        System.out.println(labrador.getFearLvl());
        System.out.print("Noroc cu " + vetAssistant.getSpecialization() + " " + vetAssistant.getAttitude() + " care ");
        vetAssistant.pet();
        vetAssistant.comfort();
        System.out.println(" in timpul tratamentului, calmandu-l. ");
        wetFood.setCalorieIntake(300);
        System.out.print("Dupa ce fetita l-a hranit pe catel cu hrana umeda pentru ceva timp, acesta ");
        if(wetFood.getCalorieIntake() > 200){
            labrador.weight = labrador.weight + 10;
            System.out.println(" s-a ingrasat cu 10 kg-are acum " + labrador.weight + ", asa ca a trebuit sa ii schimbe hrana cu un tip de hrana speciala pentru catei, care era mai putin calorica. ");
        }
        System.out.println("Pentru a-l face sa slabeasca, fetita avea rutina aceasta cu catelul, aproape zilnic: ");
        labrador.wakeUp();
        littleGirl.feedTheDog();
        littleGirl.takeForAWalk();
        System.out.print(" in " + park.getType() + " care are " + park.getGreenSpace() +  " si " + park.getDecoration());
        labrador.sleep();
        littleGirl.doHomework();
        System.out.print(" la biroul " + desk.getColor() + " stand pe " + desk.getFurniture() + desk.getComfortLvLOfFurniture() + " la lumina " + desk.getAccessories());
        System.out.println(" ");
        labrador.wakeUp();
        littleGirl.playWithDog();
        System.out.print(yard.getSize() + " unde se gasesc multi " + yard.getToys());
        System.out.print("Seara ");
        littleGirl.takeForAWalk();
        labrador.eat();
        labrador.sleep();
        labrador.balanceLifeStyle();





    }
}
