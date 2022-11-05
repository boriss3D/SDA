package advanced.exercise.Generics.Task05;

import java.util.ArrayList;

public class PetHouse<T extends PetAnimal> {
    final ArrayList<PetAnimal> petAnimals;

    public PetHouse() {
        this.petAnimals = new ArrayList<>();
    }
}
