package advanced.exercise.Generics.Task05;

public class Main {
    public static void main(String[] args) {
        PetHouse<PetAnimal> petHouse = new PetHouse<>();
        Cat cat = new Cat("Tom", 5);
        Dog dog = new Dog("Butch", 10);

        petHouse.petAnimals.add(cat);
        petHouse.petAnimals.add(dog);

        for (PetAnimal petAnimal : petHouse.petAnimals) {
            System.out.println(petAnimal.getName() + " says... ");
            petAnimal.getVoice();
        }
    }
}
